package ch.fhnw.algd1.search.binaryreverseesearch;

public class BinaryReverseSearch {


    // Standart Implementation
    public static int binSearch(int[] data, int value) {
        // TODO (A7) Implement bianry search for first element

        int l = -1;
        int h = data.length;

        while ((l + 1) != h) {
            int m = (l + h) >>> 1;
            if (data[m] < value) {
                l = m;
            } else if (data[m] > value) {
                h = m;
            } else {
                return m;
            }
        }
        return 0;
    }


    public static int reverseSearch(int[] data, int value) {


        int l = -1;
        int h = data.length;




        return 0;
    }


}

