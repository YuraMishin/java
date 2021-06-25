package sorting.insertion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class InsertionSortTest.
 * Tests insertion.InsertionSort.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 25.06.2021
 */
public class InsertionSortTest {
    private static InsertionSort insertionSort;

    /**
     * Initiates the tested instance.
     */
    @BeforeClass
    public static void init() {
        insertionSort = new InsertionSort();
    }

    /**
     * Tests instance.
     */
    @Test
    public void whenInvokesThenChecksInstance() {
        assertThat(insertionSort).isInstanceOf(InsertionSort.class);
    }

    /**
     * Tests sorting.
     */
    @Test
    public void whenSortsArrayWithTenElementsThenReturnsSortedArray() {
        int[] input = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        insertionSort.sort(input);

        Assert.assertThat(input, is(expected));
    }
}    
