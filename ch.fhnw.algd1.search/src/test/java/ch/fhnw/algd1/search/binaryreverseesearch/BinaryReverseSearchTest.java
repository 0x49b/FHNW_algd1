package ch.fhnw.algd1.search.binaryreverseesearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryReverseSearchTest {

    @Test
    public void binSearch() {
        int[] numbers = {6, 12, 14, 15, 19, 22, 23, 26, 33, 39, 48, 51, 55, 61, 62, 74, 77, 80};
        int index = BinaryReverseSearch.binSearch(numbers, 19);
        assertEquals(4, index);
    }

    @Test
    public void reverseSearch(){
        int[] numbers = {80, 77, 74, 62, 61, 55, 51, 48, 39, 33, 26, 23, 22, 19, 15, 14, 12, 6};
        int index = BinaryReverseSearch.reverseSearch(numbers, 55);
        assertEquals(5, index);
    }

}


