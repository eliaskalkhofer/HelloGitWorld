import java.util.Scanner;

/**
 * @class: Main
 * @author: Elias Kalkhofer
 * @date: 12.10.2020
 */

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int s = 0;
        int c = 0;
        int ch = 0;

        System.out.println("Einfache Rechnung");
        System.out.println("--------------------------------------");

        while(c == 0) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ersten Wert eingeben: ");
                a = sc.nextInt();
                c = 1;
            }

            catch(Exception e) {
                System.out.println("Fehler! Versuchen Sie es noch einmal!");
            }
        }


        while(c == 1) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Zweiten Wert eingeben: ");
                b = sc.nextInt();
                c = 2;
            }

            catch(Exception e) {
                System.out.println("Fehler! Versuchen Sie es noch einmal!");
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Verfahren auswählen:");
        System.out.println("Addieren(1)");
        System.out.println("Subtrahieren(2)");
        System.out.println("Multiplizieren(3)");
        System.out.println("Dividieren(4)");
        System.out.println("--------------------------------------");

        while(c == 2) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Zahlenkürzel eingeben:");
                ch = sc.nextInt();
                c = 3;
            }

            catch(Exception e) {
                System.out.println("Fehler! Versuchen Sie es noch einmal!");
            }
        }

        if(ch == 1) {
            s = a + b;
        }
        else if(ch == 2) {
            s = a  - b;
        }
        else if(ch == 3) {
            s = a  * b;
        }
        else if(ch == 4) {
            s = a  / b;
        }

        System.out.println("--------------------------------------");
        System.out.printf("Ergebnis: %d", s);

    }
}