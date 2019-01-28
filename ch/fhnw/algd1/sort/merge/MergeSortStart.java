package ch.fhnw.algd1.sort.merge;

import ch.fhnw.algd1.sort.helper.SortHelper;

public class MergeSortStart {

    public static void main(String[] args) {

        System.out.println("starting mergesort");

        SortHelper sortHelper = new SortHelper();

        int[] data = sortHelper.createArray(100000);

        sortHelper.printArray(data);

        MergeSort mergeSort = new MergeSort();

        sortHelper.printArray(mergeSort.sort(data, data.length - 1));
    }

}
