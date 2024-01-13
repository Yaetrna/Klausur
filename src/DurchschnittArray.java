import java.util.Scanner;

public class DurchschnittArray {
    public static void main(String[] args) {
        // Deklaration
        int arrayLength = 7;
        double arraySum = 0.0;
        double arrayAverage;
        double[] array = new double[arrayLength];
        Scanner scanner = new Scanner(System.in);

        // Eingabe
        for (int iterator = 0; iterator < arrayLength; iterator++) {
            System.out.println("Geben Sie bitte die " + (iterator + 1) + ". Note ein: ");
            array[iterator] = scanner.nextInt();
            arraySum += array[iterator];
        }

        // Verarbeitung
        arrayAverage = arraySum / arrayLength;

        // Ausgabe
        System.out.println("Durchschnitt des Arrays: " + arrayAverage);

        for (int iterator = 0; iterator < arrayLength; iterator++) {
            System.out.println("Kontrollausgabe - Note " + (iterator + 1) + " : " + array[iterator]);
        }

        int iterator = 0;
        for (double wert : array) {
            System.out.println("Messwert " + (iterator + 1) + ": " + wert);
            iterator++;
        }
    }
}
