import java.util.Iterator;

public class Segmento extends ImpresorLCD {


    // Puntos fijos
    private final int[] pf1;
    private final int[] pf2;
    private final int[] pf3;
    private final int[] pf4;
    private final int[] pf5;


    static final String CARACTER_VERTICAL = "|";
    static final String CARACTER_HORIZONTAL = "-";
    static final String POSICION_X = "X";
    static final String POSICION_Y = "Y";

    public Segmento() {
        // Inicializa variables
        this.pf1 = new int[2];
        this.pf2 = new int[2];
        this.pf3 = new int[2];
        this.pf4 = new int[2];
        this.pf5 = new int[2];
    }

    public void calcularPuntosFijos(int pivotX, int espacio) {
        this.pf1[0] = 0;
        this.pf1[1] = pivotX;

        this.pf2[0] = (Controller.impresor.getFilasDig() / 2);
        this.pf2[1] = pivotX;

        this.pf3[0] = (Controller.impresor.getFilasDig()- 1);
        this.pf3[1] = pivotX;

        this.pf4[0] = (Controller.impresor.getColumDig()- 1);
        this.pf4[1] = (Controller.impresor.getFilasDig() / 2) + pivotX;

        this.pf5[0] = 0;
        this.pf5[1] = (Controller.impresor.getColumDig() - 1) + pivotX;

        pivotX = pivotX + Controller.impresor.getColumDig() + espacio;
    }

    public void adicionarSegmento() {
        Iterator<Integer> iterator = Controller.impresor.getSegList().iterator();

        while (iterator.hasNext()) {
            adicionarSegmento(iterator.next());
        }

    }

    /**
     * Metodo encargado de un segmento a la matriz de Impresion
     *
     * @param segmento Segmento a adicionar
     */
    public void adicionarSegmento(int segmento) {

        switch (segmento) {
            case 1:
                Controller.impresor.adicionarLinea(this.pf1, POSICION_Y,
                        Controller.impresor.getSize(), CARACTER_VERTICAL);
                break;
            case 2:
                Controller.impresor.adicionarLinea(this.pf2, POSICION_Y,
                        Controller.impresor.getSize(), CARACTER_VERTICAL);
                break;
            case 3:
                Controller.impresor.adicionarLinea(this.pf5, POSICION_Y,
                        Controller.impresor.getSize(), CARACTER_VERTICAL);
                break;
            case 4:
                Controller.impresor.adicionarLinea(this.pf4, POSICION_Y,
                        Controller.impresor.getSize(), CARACTER_VERTICAL);
                break;
            case 5:
                Controller.impresor.adicionarLinea(this.pf1, POSICION_X,
                        Controller.impresor.getSize(), CARACTER_HORIZONTAL);
                break;
            case 6:
                Controller.impresor.adicionarLinea(this.pf2, POSICION_X,
                        Controller.impresor.getSize(), CARACTER_HORIZONTAL);
                break;
            case 7:
                Controller.impresor.adicionarLinea(this.pf3, POSICION_X,
                        Controller.impresor.getSize(), CARACTER_HORIZONTAL);
                break;
            default:
                break;
        }
    }

}
