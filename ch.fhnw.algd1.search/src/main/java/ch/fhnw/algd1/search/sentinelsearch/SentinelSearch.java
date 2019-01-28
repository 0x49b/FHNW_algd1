package ch.fhnw.algd1.search.sentinelsearch;

public class SentinelSearch {
    public static boolean exists(int[] data, int value) {
        int i = 0;

        //Get last item from array for later use
        int last = data[data.length - 1];

        //change last item of array for sentinel
        data[data.length - 1] = value;

        // check if value is in array
        while (!(data[i] == value)) {
            i++;
        }

        //change last item of array to previous saved item
        data[data.length - 1] = last;

        if (value == data[data.length - 1]) {

        }

        return (i <= data.length);
    }

    public static int firstIndex(int[] data, int value) {
        // TODO (A3 extra) Find first occurrence on an element in data (advanced challenge)
        int i = 0;

        while (i < data.length && !(data[i] == value)) {
            i++;
        }
        return (i == data.length) ? -1 : i;
    }
}