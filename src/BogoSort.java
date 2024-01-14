import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 4, 2};
        int[] test = bogoSort(array);
        for (int num : test) {
            System.out.print(num + " ");
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void allocateIndices(int[] arr) {
        Random random = new Random();
        do {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(arr.length);
            }
        } while (containsDoubles(arr));
    }

    private static boolean containsDoubles(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int ii = i + 1; ii < arr.length; ii++) {
                if (arr[i] == arr[ii]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] bogoSort(int[] arr) {
        if (isSorted(arr)) return arr;
        int[] indices = new int[arr.length];
        int[] result = new int[arr.length];
        do {
            allocateIndices(indices);
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[indices[i]];
            }
        } while (!isSorted(result));
        return result;
    }
}
