package strings.palindrom;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class SolutionTest.
 * Tests palindrom.Solution.
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
     * Tests isPalindrome() method.
     */
    @Test
    public void whenInvokesThenReturnsTrue() {
        String word = "madam";
        boolean actual = solution.isPalindrome(word);

        assertTrue(actual);
    }

    /**
     * Tests isPalindrome() method.
     */
    @Test
    public void whenInvokesThenReturnsFalse() {
        String word = "Java";
        boolean actual = solution.isPalindrome(word);

        assertFalse(actual);
    }
}
