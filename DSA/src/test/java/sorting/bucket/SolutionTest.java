package sorting.bucket;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SolutionTest.
 * Tests sorting.Solution.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 21.06.2020
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
     * Tests sort() method.
     */
    @Test
    public void whenInvokesThenSorts() {
        int[] ints = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        solution.sort(ints, ints.length);

        assertThat(ints, is(expected));
    }
}    
