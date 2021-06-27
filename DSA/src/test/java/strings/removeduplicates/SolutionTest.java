package strings.removeduplicates;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests removeduplicates.Solution.
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
     * Tests removeDuplicates() method.
     */
    @Test
    public void whenInvokesWithNullThenDoNothing() {
        String sentence = null;
        String expected = "";
        String actual = solution.removeDuplicates(sentence);

        assertEquals(expected, actual);
    }

    /**
     * Tests removeDuplicates() method.
     */
    @Test
    public void whenInvokesThenRemovesDuplicates() {
        String sentence = "Hello, Java!";
        String expected = "Helo, Jav!";
        String actual = solution.removeDuplicates(sentence);

        assertEquals(expected, actual);
    }
}
