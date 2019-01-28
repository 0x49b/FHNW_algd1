package ch.fhnw.algd1.sort;

import ch.fhnw.algd1.sort.bubble.BubbleSort;
import ch.fhnw.algd1.sort.dutch.DutchNational;
import ch.fhnw.algd1.sort.helper.SortHelper;
import ch.fhnw.algd1.sort.insertion.InsertionSort;
import ch.fhnw.algd1.sort.merge.MergeSort;
import ch.fhnw.algd1.sort.quick.QuickSort;
import ch.fhnw.algd1.sort.selection.SelectionSort;

public class SortStart {

    public static void main(String[] args) {

        long startTime, stopTime, elapsedTime;
        final int DIGITS = 100000;

        SortHelper sortHelper = new SortHelper();

        System.out.println("DUTCH NATIONAL PROBLEM");
        int[] dutchData = {1, 2, 1, 4, 2, 1, 4, 2, 1, 4, 1, 2, 1, 4, 2, 1, 4, 4, 1, 2, 4, 2, 1, 4, 2, 1, 2};
        int pivot = 2;
        sortHelper.printArray(dutchData);
        DutchNational dutchNational = new DutchNational();
        sortHelper.printArray(dutchNational.startDutchNationalSort(dutchData, pivot));


        System.out.println("\nTest with " + DIGITS + " Elements");
        System.out.println("=================================");

        /**
         * MergeSort
         */
        System.out.println("\nMERGE SORT");
        System.out.println("=================================");

        MergeSort mergeSort = new MergeSort();

        startTime = System.currentTimeMillis();

        int[] mergeData = sortHelper.createArray(DIGITS);

        mergeSort.sort(mergeData, mergeData.length);

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Total Merges: " + mergeSort.getMergeCount());
        System.out.println("Total Recursions: " + mergeSort.getRecursionCount());
        System.out.println("Time used:  " + (elapsedTime / 1000.0) + " seconds");


        /**
         * Selection Sort
         */
        System.out.println("\nSELECTION SORT");
        System.out.println("=================================");

        SelectionSort selectionSort = new SelectionSort();
        startTime = System.currentTimeMillis();

        selectionSort.sort(sortHelper.shuffleArray(sortHelper.createArray(DIGITS)));

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Total Swaps: " + selectionSort.getCounter());
        System.out.println("Total Array Accesses: " + selectionSort.getAccess());
        System.out.println("Time used:  " + (elapsedTime / 1000.0) + " seconds");


        /**
         * Insertion Sort
         */
        System.out.println("\nINSERTION SORT");
        System.out.println("=================================");

        InsertionSort insertionSort = new InsertionSort();
        startTime = System.currentTimeMillis();

        insertionSort.sort(sortHelper.shuffleArray(sortHelper.createArray(DIGITS)));

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Total Swaps: " + insertionSort.getCounter());
        System.out.println("Total Array Accesses: " + insertionSort.getAccess());
        System.out.println("Time used:  " + (elapsedTime / 1000.0) + " seconds");

        //int[] bubbleData = {5, 4, 7, 8, 1, 2, 6, 10, 25, 35, 40, 15, 3};


        /**
         * BubbleSort
         */
        System.out.println("\nBUBBLE SORT");
        System.out.println("=================================");
        BubbleSort bubbleSort = new BubbleSort();
        startTime = System.currentTimeMillis();

        bubbleSort.sort(sortHelper.shuffleArray(sortHelper.createArray(DIGITS)));

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Total Swaps: " + bubbleSort.getSwapcounter());
        System.out.println("Total Array Accesses: " + bubbleSort.getCounter());
        System.out.println("Time used:  " + (elapsedTime / 1000.0) + " seconds");


        /**
         * Quicksort
         */
        System.out.println("\nQUICK SORT");
        System.out.println("=================================");
        QuickSort quickSort = new QuickSort();
        startTime = System.currentTimeMillis();

        int[] hun2 = sortHelper.shuffleArray(sortHelper.createArray(DIGITS));
        quickSort.sort(hun2, 0, hun2.length - 1);

        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;

        System.out.println("Total Swaps: " + quickSort.getSwaps());
        System.out.println("Recursion accesses: " + quickSort.getCounter());
        System.out.println("Time used: " + (elapsedTime / 1000.0) + " seconds");

    }

}
