package com.lcdrefactor.controlador;

import com.lcdrefactor.main.ImpresorLCD;
import com.lcdrefactor.numero.Digito;
import com.lcdrefactor.segmento.Segmento;

public class Controller {

    private Segmento segmento;
    private Digito digito;
    public static ImpresorLCD impresor;


    public Controller() {
        this.segmento = new Segmento();
        this.digito = new Digito();
        this.impresor = new ImpresorLCD();
    }

    /**
     * Metodo encargado de procesar la entrada que contiene el size del segmento
     * de los digitos y los digitos a imprimir
     *
     * @param comando    Entrada que contiene el size del segmento de los digito
     *                   y el numero a imprimir
     * @param espacioDig Espacio Entre digitos
     */
    public void procesar(String comando, int espacioDig) {

        String[] parametros;

        int tam;

        if (!comando.contains(",")) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene caracter ,");
        }

        //Se hace el split de la cadena
        parametros = comando.split(",");

        //Valida la cantidad de parametros
        if (parametros.length > 2) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " contiene mas caracter ,");
        }

        //Valida la cantidad de parametros
        if (parametros.length < 2) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene los parametros requeridos");
        }

        //Valida que el parametro size sea un numerico
        if (ImpresorLCD.isNumeric(parametros[0])) {
            tam = Integer.parseInt(parametros[0]);

            // se valida que el size este entre 1 y 10
            if (tam < 1 || tam > 10) {
                throw new IllegalArgumentException("El parametro size [" + tam
                        + "] debe estar entre 1 y 10");
            }
        } else {
            throw new IllegalArgumentException("Parametro Size [" + parametros[0]
                    + "] no es un numero");
        }

        // Realiza la impresion del numero
        imprimirNumero(tam, parametros[1], espacioDig);

    }

    /**
     * Metodo encargado de imprimir un numero
     *
     * @param size      Tamaño Segmento Digitos
     * @param numeroImp Numero a Imprimir
     * @param espacio   Espacio Entre digitos
     */
    private void imprimirNumero(int size, String numeroImp, int espacio) {

        char[] digitos;

        impresor.inicializarMatriz(size, numeroImp, espacio);
        // crea el arreglo de digitos
        digitos = numeroImp.toCharArray();
        pivote(digitos);
        // Imprime matriz
        for (int i = 0; i < impresor.getTotalFilas(); i++) {
            for (int j = 0; j < impresor.getTotalColum(); j++) {
                System.out.print(impresor.getMatrizImpr()[i][j]);
            }
            System.out.println();
        }
    }


    /**
     * Metodo encargado de procesar el llenado de la matriz
     *
     * @param digitos caracteres a imprimir
     */
    public void pivote(char[] digitos) {


        int espacio = this.impresor.getEspacio();
        int pivotX = 0;
        for (char digito : digitos) {
            //Valida que el caracter sea un digito


            if (!Character.isDigit(digito)) {
                throw new IllegalArgumentException("Caracter " + digito
                        + " no es un digito");
            }
            int numero = Integer.parseInt(String.valueOf(digito));

            this.segmento.calcularPuntosFijos(pivotX, espacio);
            this.digito.adicionarDigito(numero);
            this.segmento.adicionarSegmento();
            pivotX = pivotX + this.impresor.getColumDig()+ espacio;

        }

    }


}
