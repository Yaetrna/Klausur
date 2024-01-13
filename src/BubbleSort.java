public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 5, 6, 9, 6, 0, 4};
        for (int num : array) System.out.print(num + " ");
        System.out.println();
        bubbleSort(array);
        for (int num : array) System.out.print(num + " ");
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
