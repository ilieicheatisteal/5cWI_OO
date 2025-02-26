package Sort;

import java.util.Random;

public class SortingBenchmark {

     public static void main(String[] args) {
        // Arraygrößen
        int[] sizes = {10000, 100000, 400000};

        // Sortiermethoden durchlaufen
        for (int size : sizes) {
            System.out.println("Arraygröße: " + size + " Elemente\n");

            // Zufälliges Array generieren
            int[] arrayForBubble = generateRandomArray(size);
            int[] arrayForSelection = generateRandomArray(size);
            int[] arrayForInsertion = generateRandomArray(size);
            int[] arrayForQuick = generateRandomArray(size);

            // Bubble Sort
            System.out.println("Bubble Sort:");
            benchmarkSort("Bubble Sort", arrayForBubble, SortingBenchmark::bubbleSort);

            // Selection Sort
            System.out.println("Selection Sort:");
            benchmarkSort("Selection Sort", arrayForSelection, SortingBenchmark::selectionSort);

            // Insertion Sort
            System.out.println("Insertion Sort:");
            benchmarkSort("Insertion Sort", arrayForInsertion, SortingBenchmark::insertionSort);

            // Quick Sort
            System.out.println("Quick Sort:");
            benchmarkSort("Quick Sort", arrayForQuick, SortingBenchmark::quickSort);

            System.out.println("\n------------------------\n");
        }
    }

    // Methode zum Generieren eines Arrays mit zufälligen Integer-Werten
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000); // Werte zwischen 0 und 999999
        }
        return array;
    }

    // Benchmark-Methode für die verschiedenen Sortiermethoden
    private static void benchmarkSort(String sortMethod, int[] array, Sorter sorter) {
        long startTime = System.currentTimeMillis();
        sorter.sort(array); // Sortiermethode aufrufen
        long endTime = System.currentTimeMillis();
        System.out.println(sortMethod + " Dauer: " + (endTime - startTime) + " ms\n");
    }

    // Interface für die Sortiermethoden
    @FunctionalInterface
    interface Sorter {
        void sort(int[] array);
    }

    // Implementierung von Bubble Sort
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Elemente tauschen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Wenn kein Element mehr getauscht wurde, ist das Array sortiert
            if (!swapped) break;
        }
    }

    // Implementierung von Selection Sort
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Annahme: Das aktuelle Element ist das kleinste
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Tausche das kleinste Element mit dem ersten Element des unsortierten Bereichs
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Implementierung von Insertion Sort
    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Verschiebe größere Elemente nach rechts
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // Setze das aktuelle Element an die richtige Position
            array[j + 1] = key;
        }
    }

    // Implementierung von Quick Sort
    private static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            // Partitionierung des Arrays und Rückgabe des Index des Pivot-Elements
            int pivotIndex = partition(array, low, high);

            // Rekursiv Quick Sort auf den linken und rechten Teil anwenden
            quickSortHelper(array, low, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, high);
        }
    }

    // Partitionierungsmethode für Quick Sort
    private static int partition(int[] array, int low, int high) {
        // Wir wählen das letzte Element als Pivot
        int pivot = array[high];
        int i = (low - 1); // Index des kleineren Elements

        for (int j = low; j < high; j++) {
            // Wenn das aktuelle Element kleiner als der Pivot ist
            if (array[j] < pivot) {
                i++;
                // Tausche array[i] und array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Tausche das Pivot-Element an die richtige Position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
