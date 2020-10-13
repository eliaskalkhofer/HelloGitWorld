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

        System.out.println("Einfache Addition");

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

        s = a + b;
        System.out.printf("Ergebnis: %d", s);

    }
}