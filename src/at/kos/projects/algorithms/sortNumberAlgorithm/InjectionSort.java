package at.kos.projects.algorithms.sortNumberAlgorithm;

public class InjectionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };

        System.out.println("Unsortiertes Array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sortiertes Array:");
        printArray(array);
    }
}