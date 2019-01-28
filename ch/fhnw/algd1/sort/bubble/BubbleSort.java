package ch.fhnw.algd1.sort.bubble;

public class BubbleSort {

    double swapcounter = 0;
    double counter = 0;


    public int[] sort(int[] data) {

        for (int n = data.length; n > 1; n--) {

            for (int i = 0; i < n - 1; i++) {

                if (data[i] > data[i + 1]) {

                    int cache = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = cache;

                    this.swapcounter++;
                }
                this.counter++;
            }
        }
        return data;
    }

    public double getSwapcounter() {
        return swapcounter;
    }

    public double getCounter() {
        return counter;
    }
}
