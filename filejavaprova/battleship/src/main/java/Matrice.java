/**
 * Classe che modella la griglia di gioco.
 * @author Antonio Campanozzi
 * */

public class Matrice {
    /**
     * String[][] variable tabella.
     * array bidimensionale che ospita la griglia di gioco.
     * */
    private String[][]tabella;
    /**
     * costruttore della classe Matrice.
     * assegna alla tebella la dimensione
     * di default 10x10 e la inizializza
     * inserendo i caratteri "~~"
     * che rappresentano il mare
     * */
    Matrice() {
        this.tabella = new String[10][10];
        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella.length; j++) {
                tabella[i][j] = "~~";
            }

        }
    }
    /**
     * override del metodo toString della class object.
     * questo stampa la griglia di gioco.
     * @return s stringa contenente la griglia.
     * */
    public String toString() {
        String[] columnLetters = {"A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J"};
        String s = " ";
        for (int r = 0; r < tabella.length; r++) {
            s = s + "  " + (r + 1);

        }
        for (int i = 0; i < tabella.length; i++) {
            s = s + " " + "\n" + columnLetters[i] + " ";
            for (int j = 0; j < tabella.length; j++) {
                s = s + tabella[i][j] + " ";
            }
        }
        return s;
    };
}
