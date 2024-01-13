import java.util.Scanner;

public class Messung {
    public static void main(String[] args) {
        // Deklaration
        int arraySize = 5;
        double arraySum = 0.0;
        double[] array = new double[arraySize];
        Scanner scanner = new Scanner(System.in);

        // Eingabe
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Messwert " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
            arraySum = arraySum + array[i];
        }

        // Verarbeitung
        System.out.println("Durchschnitt: " + arraySum / arraySize);

        // Ausgabe
        // array.length enthält den gleichen Wert wie arraySize!
        for (int i = 0; i < array.length; i++) {
            System.out.println("Messwert " + (i + 1) + ": " + array[i]);
        }

        /*
        Neue Konstruktion - nicht relevant für die Klausur → entspricht demselben wie ein Absatz oben.

        for (int i = 0; i < array.length; i++ {
            System.out.println(array[i]);
        }

        IST DAS GLEICHE WIE

        for (int value : array) {
            System.out.println(value);
        }
         */

        int iterator = 0;
        for (double value : array) {
            System.out.println("Messwert " + (iterator + 1) + ": " + value);
            iterator++;
        }
    }
}
