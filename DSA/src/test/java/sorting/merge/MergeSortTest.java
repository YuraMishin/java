package sorting.merge;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class MergeSortTest.
 * Tests merge.MergeSort.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 25.06.2021
 */
public class MergeSortTest {
    private static MergeSort mergeSort;

    /**
     * Initiates the tested instance.
     */
    @BeforeClass
    public static void init() {
        mergeSort = new MergeSort();
    }

    /**
     * Tests instance.
     */
    @Test
    public void whenInvokesThenChecksInstance() {
        assertThat(mergeSort).isInstanceOf(MergeSort.class);
    }

    /**
     * Tests sorting.
     */
    @Test
    public void whenSortsArrayWithTenElementsThenReturnsSortedArray() {
        int[] input = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        mergeSort.sort(input);

        Assert.assertThat(input, is(expected));
    }
}
