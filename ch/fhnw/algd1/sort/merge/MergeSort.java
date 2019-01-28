package ch.fhnw.algd1.sort.merge;

public class MergeSort {

    private double mergeCount = 0;
    private double recursionCount = 0;


    public int[] sort(int[] data, int n) {

        if (n < 2) {
            return data;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = data[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = data[i];
        }

        sort(l, mid);
        sort(r, n - mid);

        this.recursionCount++;

        return merge(data, l, r, mid, n - mid);
    }

    private int[] merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }

            this.mergeCount++;
        }
        while (i < left) {
            a[k++] = l[i++];
            this.mergeCount++;
        }
        while (j < right) {
            a[k++] = r[j++];
            this.mergeCount++;
        }
        return a;
    }

    public double getMergeCount() {
        return mergeCount;
    }

    public double getRecursionCount() {
        return recursionCount;
    }
}
