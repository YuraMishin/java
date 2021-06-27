package strings.capitalize;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests capitalize.Solution.
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
     * Tests capitalize() method.
     */
    @Test
    public void whenInvokesWithNullThenReturnsEmpty() {
        String sentence = null;
        String expected = "";
        String actual = solution.capitalize(sentence);

        assertEquals(expected, actual);
    }

    /**
     * Tests capitalize() method.
     */
    @Test
    public void whenInvokesWithEmptyThenReturnsEmpty() {
        String sentence = "";
        String expected = "";
        String actual = solution.capitalize(sentence);

        assertEquals(expected, actual);
    }

    /**
     * Tests capitalize() method.
     */
    @Test
    public void whenInvokesThenCapitalize() {
        String sentence = "hello, world!";
        String expected = "Hello, World!";
        String actual = solution.capitalize(sentence);

        assertEquals(expected, actual);
    }
}
