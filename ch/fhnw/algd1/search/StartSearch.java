package ch.fhnw.algd1.search;


import src.ch.fhnw.algd1.search.bin.BinSearch;
import src.ch.fhnw.algd1.search.prime.PrimeCheck;
import src.ch.fhnw.algd1.search.sentinel.SentinelSearch;

public class StartSearch {

    public static void main(String[] args) {

        //int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] data = {1, 1, 2, 3, 5, 8, 13, 14, 15, 22, 24, 24, 24, 30, 31};
        int needle = 24;

        // Biinary Search implementation
        BinSearch binSearch = new BinSearch();
        int position = binSearch.binSearchImpl(data, needle);
        System.out.println("BinarySearch Needle of " + needle + " on Position: " + position);

        // Check PrimeNumber for Needle
        PrimeCheck primeCheck = new PrimeCheck();
        Boolean primeC = primeCheck.checkNumberForPrime(needle);
        System.out.println("Result of primeCheck for Needle " + needle + " is: " + primeC);

        // SentinelSearch for a Needle
        SentinelSearch sentinelSearch = new SentinelSearch();
        Boolean sentinelC = sentinelSearch.existsSentinel(data, needle);
        System.out.println("Found needle " + needle + " with Sentinel: " + sentinelC);

        //First Index with Sentinel
        int sentinelI = sentinelSearch.indexSentinel(data, needle);
        System.out.println("Found needle " + needle + " with Sentinel at index: " + sentinelI);

    }


}
