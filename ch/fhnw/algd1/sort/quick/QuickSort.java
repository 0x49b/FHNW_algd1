package ch.fhnw.algd1.sort.quick;

public class QuickSort {

    private double counter = 0;
    private double swaps = 0;

    public int[] sort(int arr[], int low, int high) {
        if (low < high) {

            this.counter++;
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        return arr;
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                this.swaps++;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        this.swaps++;

        return i + 1;
    }

    public double getCounter() {
        return counter;
    }

    public double getSwaps() {
        return swaps;
    }
}
