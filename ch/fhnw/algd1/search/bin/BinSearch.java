package src.ch.fhnw.algd1.search.bin;

public class BinSearch {

    public int binSearchImpl(int[] data, int value) {
        int l = -1, h = data.length;
        while (l + 1 != h) {
            int m = (l + h) / 2;
            if (data[m] < value) {
                l=m;
            } else if (data[m] > value) {
                h=m;
            } else {
                return m;
            }
        }
        return -1;
    }
}
