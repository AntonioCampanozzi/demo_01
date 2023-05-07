


import java.util.Scanner;
/**
 * classe che definisce il controllo del sistema di gioco.
 * @author Antonio Campanozzi
 *
 * */
public abstract class SystemControl {
    /**
     * Matrice variable m.
     */
    private static Matrice m = new Matrice();
    /**
     * metodo che permette di uscire dalla partita,
     * riportando il controllo al sistema operativo.
     *  */
    static void exit() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("uscire?: ");
        String u = scanner.nextLine();
        if (u.matches("si")) {
            System.out.println("**programma terminato**");
            System.exit(0);
        } else if (u.matches("no")) {
            commandInsertion();
        } else {
            System.out.println("opzione non valida");
            exit();
        }
    }
    /**
     * metodo che mostra al giocatore la lista
     * dei comandi leciti.
     * */
    static void help() {
        System.out.println("lista dei comandi leciti: ");
        System.out.println(
                "-'/svelagriglia': mostra la griglia con le"
                        +
                " relative posizioni delle navi");
        System.out.println("-'/esci': esce dalla partita");
        System.out.println("-'/gioca': inizia una nuova partita");
        System.out.println(
                "-'/mostranavi': mostra i tipi di navi e"
                         +
                " la quantita' in cui sono presenti");
        System.out.println(
                "-'/mostralivello': mostra i "
                        +
                        "livelli di difficolta'");
    }
     /**
      * metodo che prende da tastiera i comandi dell'utente
      * e controlla che siano comandi leciti.
      * */
    static void commandInsertion() {
        System.out.print("user>> ");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String command = scanner.nextLine();
        if (command.matches("/esci")) {
            exit();
        } else if (command.matches("/svelagriglia")) {
            System.out.println(m);
            commandInsertion();
        } else if (command.matches("/help")
                ||
                command.matches("--help")
                ||
                command.matches("-h")) {
            help();
            commandInsertion();

        } else {
            System.out.println("Errore: comando non trovato.");
            commandInsertion();
        }
    }
 /**main del programma.
  * @param args array di stringhe del main
 * */
    public static void main(final String[] args) {
        System.out.println("digitare '/help', '--help' oppure '-h' "
                +
                "per ottenere informazioni sui comandi leciti");
        //matrix.fill(matrix);
        commandInsertion();
    }
}
