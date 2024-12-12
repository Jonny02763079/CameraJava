package at.kos.projects.algorithms.sortNumberAlgorithm.gui;

import at.kos.projects.algorithms.sortNumberAlgorithm.BubbleSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.SelectionSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.InsertionSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.Sort;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    private Sort selectedSorter;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Print Sorters");
            System.out.println("2. Select Sorter");
            System.out.println("3. Enter Numbers for Unsorted Array");
            System.out.println("4. Enter Range for Random Unsorted Array");
            System.out.println("5. Exit");
            System.out.println("");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printSorters();
                    break;
                case 2:
                    selectSorter(scanner);
                    break;
                case 3:
                    enterNumbers(scanner);
                    break;
                case 4:
                    enterRangeForRandomArray(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("\nExiting program...\n");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.\n");
            }
        }
    }

    private void printSorters() {
        System.out.println("\nAvailable Sorters:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("");
    }

    private void selectSorter(Scanner scanner) {
        System.out.println("\nSelect a sorter:");
        int sorterChoice = scanner.nextInt();
        switch (sorterChoice) {
            case 1:
                selectedSorter = new BubbleSort();
                System.out.println("\nBubble Sort selected.\n");
                break;
            case 2:
                selectedSorter = new SelectionSort();
                System.out.println("\nSelection Sort selected.\n");
                break;
            case 3:
                selectedSorter = new InsertionSort();
                System.out.println("\nInsertion Sort selected.\n");
                break;
            default:
                System.out.println("\nInvalid choice. No sorter selected.\n");
        }
    }

    private void enterNumbers(Scanner scanner) {
        if (selectedSorter == null) {
            System.out.println("\nPlease select a sorter first.\n");
            return;
        }

        System.out.println("\nEnter the numbers for the unsorted array (semicolon separated):");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] array = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.println("\nUnsorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");

        selectedSorter.sort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    private void enterRangeForRandomArray(Scanner scanner) {
        if (selectedSorter == null) {
            System.out.println("\nPlease select a sorter first.\n");
            return;
        }

        System.out.println("\nEnter the start value for the random array:");
        int start = scanner.nextInt();

        System.out.println("\nEnter the end value for the random array:");
        int end = scanner.nextInt();

        if (start >= end) {
            System.out.println("\nInvalid range. Start value must be less than the end value.\n");
            return;
        }

        System.out.println("\nEnter the number of elements in the array:");
        int size = scanner.nextInt();

        int[] array = generateRandomArray(start, end, size);

        System.out.println("\nUnsorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectedSorter.sort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private int[] generateRandomArray(int start, int end, int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(end - start + 1) + start;
        }

        return array;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}
