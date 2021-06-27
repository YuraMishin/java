package strings.mostrepeatedchar;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Class SolutionTest.
 * Tests mostrepeatedchar.Solution.
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
     * Tests getMaxOccuringChar() method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void whenInvokesThenThrowsExceptionA() {
        String str = null;
        String expected = "cba";
        String actual = solution.getMaxOccuringChar(str);

        assertEquals(expected, actual);
    }

    /**
     * Tests getMaxOccuringChar() method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void whenInvokesThenThrowsExceptionB() {
        String str = "";
        String expected = "cba";
        String actual = solution.getMaxOccuringChar(str);

        assertEquals(expected, actual);
    }

    /**
     * Tests getMaxOccuringChar() method.
     */
    @Test
    public void whenInvokesThenReturnsL() {
        String str = "Hello World";
        String expected = "l";
        String actual = solution.getMaxOccuringChar(str);

        assertEquals(expected, actual);
    }
}
