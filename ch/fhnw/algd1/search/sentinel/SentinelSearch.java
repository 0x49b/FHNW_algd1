package src.ch.fhnw.algd1.search.sentinel;

public class SentinelSearch {

    public boolean existsSentinel(int[] data, int value) {

        if (data[data.length - 1] == value) {
            return true;
        } else {

            int lastEl = data[data.length - 1];
            data[data.length - 1] = value;
            int i = 0;

            while (data[i] != value) {
                i++;
            }
            data[data.length - 1] = lastEl;
            return i < data.length - 1;

        }
    }

    public int indexSentinel(int[] data, int value) {
        int lastEl = data[data.length - 1];
        data[data.length - 1] = value;
        int i = 0;
        while (data[i] != value) {
            i++;
        }
        data[data.length - 1] = lastEl;
        return i < data.length - 1 || lastEl == value ? i : -1;
    }
}
