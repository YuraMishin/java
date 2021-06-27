package strings.reversewords;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests reversewords.Solution.
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
     * Tests reverseWords() method.
     */
    @Test
    public void whenInvokesWithNUllThenReturnsNothing() {
        String sentence = null;
        String expected = "";
        String actual = solution.reverseWords(sentence);

        assertEquals(expected, actual);
    }

    /**
     * Tests reverseWords() method.
     */
    @Test
    public void whenInvokesThenReturnsReversed() {
        String sentence = "Hello World !";
        String expected = "! World Hello";
        String actual = solution.reverseWords(sentence);

        assertEquals(expected, actual);
    }
}
