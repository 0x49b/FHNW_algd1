package ch.fhnw.algd1.sort.selection;

public class SelectionSort  {

    private double counter = 0;
    private double access = 0;


    public int[] sort(int[] data) {

        // Outer loop
        for (int i = 0; i < (data.length); i++) {

            // Inner loop
            for (int c = i + 1; c < (data.length); c++) {

                if (data[c] < data[i]) {
                    int cache = data[i];
                    data[i] = data[c];
                    data[c] = cache;
                    this.counter++;
                }

                this.access++;
            }

            this.access++;
        }

        return data;
    }

    public int[] sortReverse(int[] data) {

        // Outer loop
        for (int i = 0; i < (data.length); i++) {

            // Inner loop
            for (int c = i + 1; c < (data.length); c++) {

                if (data[c] > data[i]) {
                    int cache = data[c];
                    data[c] = data[i];
                    data[i] = cache;
                }

            }
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
