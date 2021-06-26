package searching.jump;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class SolutionTest.
 * Tests jump.Solution.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 26.06.2021
 */
public class SolutionTest {
    private static Solution solution;

    /**
     * Initiates the tested instance.
     */
    @BeforeClass
    public static void init() {
        solution = new Solution();
    }

    /**
     * Tests instance.
     */
    @Test
    public void whenInvokesThenChecksInstance() {
        assertThat(solution).isInstanceOf(Solution.class);
    }

    /**
     * Tests jumpSearch() method.
     */
    @Test
    public void whenFindsValueThenReturnsTrue() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        boolean expected = true;
        boolean result = solution.jumpSearch(array, value);

        assertThat(result, is(expected));
    }

    /**
     * Tests jumpSearch() method.
     */
    @Test
    public void whenValueOutOfRangeThenReturnsFalse() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 30;
        boolean expected = false;
        boolean result = solution.jumpSearch(array, value);

        assertThat(result, is(expected));
    }
}    
