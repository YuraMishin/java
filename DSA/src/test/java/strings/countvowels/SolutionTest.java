package strings.countvowels;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests countvowels.Solution.
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
     * Tests countVowels() method.
     */
    @Test
    public void whenInvokesThenFindsResult() {
        String phrase = "Java";
        int expected = 2;
        int actual = solution.countVowels(phrase);

        assertEquals(expected, actual);
    }

    /**
     * Tests countVowels() method.
     */
    @Test
    public void whenInvokesThenReturnsZero() {
        String phrase = "BCD";
        int expected = 0;
        int actual = solution.countVowels(phrase);

        assertEquals(expected, actual);
    }
}
