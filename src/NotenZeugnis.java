import java.util.Scanner;

public class NotenZeugnis {
    public static void main(String[] args) {
        // Deklaration
        int numberOfStudents;
        int numberOfGrades;
        double gradeSum = 0;
        double[][] classArray;
        Scanner scanner = new Scanner(System.in);

        // Eingabe
        System.out.println("Geben Sie die Anzahl der Schüler in der Klasse an: ");
        numberOfStudents = scanner.nextInt();

        // Verarbeitung
        classArray = new double[numberOfStudents][];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Geben Sie die Anzahl der Noten für den " + (i + 1) + ". Schüler an: ");
            numberOfGrades = scanner.nextInt();
            classArray[i] = new double[numberOfGrades];
            for (int j = 0; j < numberOfGrades; j++) {
                System.out.println("Geben Sie die " + (j + 1) + ". Note für den " + (i + 1) + ". Schüler an: ");
                classArray[i][j] = scanner.nextDouble();
            }
            for (int k = 0; k < numberOfGrades; k++) {
                gradeSum += classArray[i][k];
            }
            // Ausgabe
            System.out.println("Der Durchschnitt des " + (i + 1) + ". Schülers beträgt: " + gradeSum / numberOfGrades);
            gradeSum = 0;
        }
        // Kontrollausgabe
        int iterator = 1;
        for (double[] student : classArray) {
            System.out.println("Schüler: " + iterator);
            iterator++;
            for (double grade : student) {
                System.out.println("Note: " + grade);
            }
        }
    }
}
