package training.ideas.java.calculator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnmao on 9/4/2014.
 */
public class BubbleSortTest {
    @Test
    public void verifyIntegerBubbleSortingAscendingOrder_PassDifferentValues() {
        int[] integersValues = {5, 4, 3, 1, 7, 6, 2};
        int[] sortedIntegerValues = {1, 2, 3, 4, 5, 6, 7};
        BubbleSort bSort = new BubbleSort();
        assertArrayEquals("Values were not sorted", sortedIntegerValues, bSort.asc(integersValues));
    }

}
