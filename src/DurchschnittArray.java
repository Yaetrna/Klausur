import java.util.Scanner;

public class DurchschnittArray {
    public static void main(String[] args) {
        int length = 7;
        double sum = 0.0;
        double[] array = new double[length];
        Scanner scanner = new Scanner(System.in);

        for (int enumerator = 0; enumerator < length; enumerator++) {
            System.out.println("Geben Sie bitte die " + (enumerator + 1) + ". Note ein: ");
            array[enumerator] = scanner.nextInt();
            sum += array[enumerator];
        }

        System.out.println("Der Durchschnitt lautet: " + sum / length);

        System.out.println("Klassische for-Schleife beginnt jetzt");

        for (int enumerator = 0; enumerator < length; enumerator++) {
            System.out.println("Kontrollausgabe - Note " + (enumerator + 1) + " : " + array[enumerator]);
        }

        System.out.println("Klassische for-Schleife endet jetzt");

        System.out.println("Moderne foreach-Schleife beginnt jetzt");

        int iterator = 0;
        for (double wert : array) {
            System.out.println("Messwert " + (iterator + 1) + ": " + wert);
            iterator++;
        }

        System.out.println("Moderne foreach-Schleife endet jetzt");
    }
}
