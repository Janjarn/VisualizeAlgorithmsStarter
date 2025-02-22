package visualizealgorithms.bll.algorithm.Sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

import java.time.Duration;
import java.time.Instant;

public class QuickSort extends GenericAlgorithm {

    int partition(Comparable arr[], int low, int high) {
        Comparable pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                // swap arr[i] and arr[j]
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Comparable temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public QuickSort() {
        super("QuickSort", "Fast O(N Log(N) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        //int []b = (int[]) super.getData();
        //quickSort(b, 0, b.length - 1);
        Comparable[] arr = (Comparable[]) super.getData();

        sort(arr, 0, arr.length -1);
    }

    private void sort(Comparable[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /*public int[] quickSort(int[] arr, int low, int high) {
        Instant start = Instant.now();

        sort(arr, low, high);

        Instant finish = Instant.now();

        long elapsedTime = Duration.between(start, finish).toMillis();

        System.out.println("Finished QuickSort on " + arr.length + " items in " + elapsedTime + " ms");

        return arr;
    }*/
}