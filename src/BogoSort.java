import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        // Initialisieren des zu sortierenden Arrays
        int[] array = {1, 2, 6, 3, 4, 2};

        // Aufruf der Methode bogoSort zum Sortieren des Arrays
        int[] test = bogoSort(array);

        // Gibt den sortierten Array aus
        for (int num : test) {
            System.out.print(num + " ");
        }
    }

    // Funktion zur Überprüfung, ob ein Array in aufsteigender Reihenfolge sortiert ist (z. B. { 1, 4, 6, 9 })
    private static boolean isSorted(int[] arr) {
        // Schleife, die über das Array iteriert.
        for (int i = 0; i < arr.length - 1; i++) {
            // Wenn das aktuelle Element größer ist als das nächste, wird false zurückgegeben
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        // Wenn kein unsortiertes Paar gefunden wird, wird true zurückgegeben.
        return true;
    }

    // Funktion zur Erzeugung von Zufallsindizes
    private static void allocateIndices(int[] arr) {
        // Ein neues Random-Objekt erstellen
        Random random = new Random();
        // Es werden so lange Zufallsindizes erstellt, bis diese keine Duplikate erhalten.
        // Nicht sehr effizient aber wir Arbeiten hier auch mit bogoSort.
        do {
            for (int i = 0; i < arr.length; i++) {
                // Zuweisung eines Zufallsindexes an die aktuelle Position
                arr[i] = random.nextInt(arr.length);
            }
        } while (containsDoubles(arr));
    }

    // Funktion zur Prüfung, ob ein Array Duplikate enthält
    private static boolean containsDoubles(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int ii = i + 1; ii < arr.length; ii++) {
                // Wenn ein Duplikat gefunden wird, wird true zurückgegeben
                if (arr[i] == arr[ii]) {
                    return true;
                }
            }
        }
        // Wenn keine Duplikate gefunden wurden, wird false zurückgegeben.
        return false;
    }

    // Funktion zum Sortieren eines Arrays mit dem BogoSort-Algorithmus
    public static int[] bogoSort(int[] arr) {
        // Prüfen, ob das Array bereits sortiert ist
        if (isSorted(arr)) return arr;

        // Erstellen von Arrays zur Aufnahme der Indizes und des Ergebnisses
        int[] indices = new int[arr.length];
        int[] result = new int[arr.length];

        // Es werden so lange Permutationen erzeugt, bis es eine sortierte Permutation gibt.
        do {
            allocateIndices(indices);
            for (int i = 0; i < arr.length; i++) {
                // Anwendung der Permutation auf das Array
                result[i] = arr[indices[i]];
            }
        } while (!isSorted(result));

        // Rückgabe des sortierten Arrays
        return result;
    }
}
