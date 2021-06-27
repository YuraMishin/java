package strings.stringreverse;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests stringreverse.Solution.
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
     * Tests reverse() method.
     */
    @Test
    public void whenInvokesThenChecksReverse() {
        String string = "abc";
        String expected = "cba";
        String actual = solution.reverseByStack(string);

        assertEquals(expected, actual);
    }

    /**
     * Tests reverseByStringBuilder() method.
     */
    @Test
    public void whenInvokesThenReverses() {
        String string = "abc";
        String expected = "cba";
        String actual = solution.reverseByStringBuilder(string);

        assertEquals(expected, actual);
    }

    /**
     * Tests reverseByStringBuilder() method.
     */
    @Test
    public void whenInvokesThenReturnsEmpty() {
        String string = null;
        String expected = "";
        String actual = solution.reverseByStringBuilder(string);

        assertEquals(expected, actual);
    }

}
