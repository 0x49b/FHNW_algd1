package ch.fhnw.algd1.sort.dutch;

public class DutchNational {

    /**
     * Sort an int array of undefined length, but only contains three different elements
     * @param data
     * @param pivot
     * @return
     */
    public int[] startDutchNationalSort(int[] data, int pivot) {

        int l = 0, m = 0, r = data.length - 1;
        while (m <= r) {
            if (data[m] < pivot) {
                data = swap(data, l++, m++);
            } else if (data[m] > pivot) {
                data = swap(data, m, r--);
            } else if (data[m] == pivot) {
                m++;
            }
        }
        return data;
    }

    /**
     * Swap Elements
     * @param data
     * @param p1
     * @param p2
     * @return
     */
    private int[] swap(int[] data, int p1, int p2) {
        int cache = data[p1];
        data[p1] = data[p2];
        data[p2] = cache;

        return data;
    }


}
