package searching.binary;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Class BinarySearchTest.
 * Tests BinarySearch class.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 26.06.2021
 */
public class BinarySearchTest {
    /**
     * Tests binarySearchRec() method.
     */
    @Test
    public void whenFindsValueThenReturnsTrue() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        boolean expected = true;
        boolean result = new BinarySearch().binarySearchRec(array, value);

        assertThat(result, is(expected));
    }

    /**
     * Tests binarySearchRec() method.
     */
    @Test
    public void whenValueOutOfRangeThenReturnsFalse() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 30;
        boolean expected = false;
        boolean result = new BinarySearch().binarySearchRec(array, value);

        assertThat(result, is(expected));
    }

    /**
     * Tests binarySearch() method.
     */
    @Test
    public void whenFindsValueThenTrue() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        boolean expected = true;
        boolean result = new BinarySearch().binarySearch(array, value);

        assertThat(result, is(expected));
    }

    /**
     * Tests binarySearch() method.
     */
    @Test
    public void whenValueOutOfRangeThenFalse() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 30;
        boolean expected = false;
        boolean result = new BinarySearch().binarySearch(array, value);

        assertThat(result, is(expected));
    }
}