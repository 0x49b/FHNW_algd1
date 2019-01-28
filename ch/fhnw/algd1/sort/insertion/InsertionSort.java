package ch.fhnw.algd1.sort.insertion;

public class InsertionSort {

    private double counter = 0;
    private double access = 0;


    public int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {

            int sortingVal = data[i];
            int j = i;

            while (j > 0 && data[j - 1] > sortingVal) {
                data[j] = data[j - 1];
                j = j - 1;

                this.access++;
                this.counter++;
            }
            data[j] = sortingVal;
            this.access++;
        }
        return data;
    }

    public double getCounter() {
        return counter;
    }

    public double getAccess() {
        return access;
    }
}
