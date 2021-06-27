package strings.isrotated;

import org.junit.BeforeClass;
import org.junit.Test;
import strings.isrotated.Solution;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class SolutionTest.
 * Tests isrotated.Solution.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 27.06.2021
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
     * Tests areRotations() method.
     */
    @Test
    public void whenInvokesThenReturnsTrue() {
        boolean actual = solution.areRotations("ABCD", "DABC");

        assertTrue(actual);
    }

    /**
     * Tests areRotations() method.
     */
    @Test
    public void whenInvokesThenReturnsFalse() {
        boolean actual = solution.areRotations("ABCD", "DBCA");

        assertFalse(actual);
    }

    /**
     * Tests areRotations() method.
     */
    @Test
    public void whenInvokesWithNullThenReturnsFalse() {
        boolean actual = solution.areRotations(null, "DBCA");

        assertFalse(actual);
    }
}
