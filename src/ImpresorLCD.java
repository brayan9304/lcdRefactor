import java.util.ArrayList;
import java.util.List;

public class ImpresorLCD {


    private String[][] matrizImpr;
    private int size;
    private int espacio;

    // Calcula el numero de filasDig
    private int filasDig;
    private int columDig;
    private int totalFilas;
    private int totalColum;

    // Establece los segmentos de cada numero
    private List<Integer> segList = new ArrayList<>();

    public ImpresorLCD() {

    }//Constructor vacio

    //Metodos getter y setter

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getSize() {
        return size;
    }

    public int getFilasDig() {
        return filasDig;
    }

    public int getColumDig() {
        return columDig;
    }

    public int getTotalFilas() {
        return totalFilas;
    }

    public int getTotalColum() {
        return totalColum;
    }

    public List<Integer> getSegList() {
        return segList;
    }

    public void setSegList(List<Integer> segList) {
        this.segList = segList;
    }

    public String[][] getMatrizImpr() {
        return matrizImpr;
    }

    /**
     * Metodo encargado de añadir una linea a la matriz de Impresion
     *
     * @param punto    Punto Pivote
     * @param posFija  Posicion Fija
     * @param size     Tamaño Segmento
     * @param caracter Caracter Segmento
     */
    public void adicionarLinea(int[] punto, String posFija, int size, String caracter) {

        if (posFija.equalsIgnoreCase(Segmento.POSICION_X)) {
            for (int y = 1; y <= size; y++) {
                int valor = punto[1] + y;
                this.matrizImpr[punto[0]][valor] = caracter;
            }
        } else {
            for (int i = 1; i <= size; i++) {
                int valor = punto[0] + i;
                this.matrizImpr[valor][punto[1]] = caracter;
            }
        }
    }


    /**
     * Metodo encargado de inicializar la matriz de Impresion
     * @param size Tamaño Segmento
     * @param numeroImp Número a imprimir
     * @param espacio Tamaño del espacio
     */
    public void inicializarMatriz(int size, String numeroImp, int espacio) {
        this.size = size;


        // Calcula el numero de filas cada digito
        this.filasDig = (2 * this.size) + 3;

        // Calcula el numero de columna de cada digito
        this.columDig = this.size + 2;

        // Calcula el total de filas de la matriz en la que se almacenaran los digitos
        this.totalFilas = this.filasDig;

        // Calcula el total de columnas de la matriz en la que se almacenaran los digitos
        this.totalColum = (this.columDig * numeroImp.length())
                + (espacio * numeroImp.length());

        // crea matriz para almacenar los numero a imprimir
        this.matrizImpr = new String[this.totalFilas][this.totalColum];


        // Inicializa matriz
        for (int i = 0; i < this.totalFilas; i++) {
            for (int j = 0; j < this.totalColum; j++) {
                this.matrizImpr[i][j] = " ";
            }
        }
        setEspacio(espacio);
    }

    /**
     * Metodo encargado de validar si una cadena es numerica
     *
     * @param cadena Cadena
     */
    static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
