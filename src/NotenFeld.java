import java.util.Scanner;

public class NotenFeld {
    public static void main(String[] args) {
        // Deklaration
        Scanner scanner = new Scanner(System.in);
        int numberOfGrades;
        double minimum;
        double maximum;
        double sumOfGrades = 0;
        double[] gradeArray;

        // Eingabe
        System.out.println("Geben Sie die Anzahl der Noten ein: ");
        numberOfGrades = scanner.nextInt();
        gradeArray = new double[numberOfGrades];

        // Verarbeitung
        for (int i = 0; i < gradeArray.length; i++) {
            System.out.println("Enter the " + (i + 1) + ". Grade: ");
            gradeArray[i] = scanner.nextDouble();
        }

        for (double grade : gradeArray) {
            sumOfGrades += grade;
        }

        // Maximum und Minimum
        minimum = gradeArray[0];
        for (double num : gradeArray) {
            if (num < minimum) {
                minimum = num;
            }
        }

        maximum = gradeArray[0];
        for (double num : gradeArray) {
            if (num > maximum) {
                maximum = num;
            }
        }

        // Ausgabe
        System.out.println("Durchschnitt: " + sumOfGrades / numberOfGrades);
        System.out.println("Maximum     : " + maximum);
        System.out.println("Minimum     : " + minimum);
        for (double grade : gradeArray) {
            System.out.println(grade);
        }
    }
}
