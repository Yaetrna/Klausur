import java.util.Scanner;

public class NotenFeld {
    public static void main(String[] args) {
        // Deklaration
        Scanner scanner = new Scanner(System.in);
        int numberOfGrades;
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

        // Ausgabe
        System.out.println("Der Durchschnitt beträgt: " + sumOfGrades / numberOfGrades);

        for (double grade : gradeArray) {
            System.out.println(grade);
        }
    }
}
