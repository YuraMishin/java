package strings.checkanagrams;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class SolutionTest.
 * Tests checkanagrams.Solution.
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
     * Tests areAnagramsOne() method.
     */
    @Test
    public void whenInvokesThenReturnsTrue() {
        String firstWord = "abc";
        String secondWord = "cba";
        boolean actual = solution.areAnagramsOne(firstWord, secondWord);

        assertTrue(actual);
    }

    /**
     * Tests areAnagramsOne() method.
     */
    @Test
    public void whenInvokesThenReturnsFalse() {
        String firstWord = "abc";
        String secondWord = "cbacba";
        boolean actual = solution.areAnagramsOne(firstWord, secondWord);

        assertFalse(actual);
    }

    /**
     * Tests areAnagramTwo() method.
     */
    @Test
    public void whenInvokesTwoThenReturnsTrue() {
        String firstWord = "abc";
        String secondWord = "cba";
        boolean actual = solution.areAnagramTwo(firstWord, secondWord);

        assertTrue(actual);
    }

    /**
     * Tests areAnagramTwo() method.
     */
    @Test
    public void whenInvokesTwoThenReturnsFalse() {
        String firstWord = "abc";
        String secondWord = "cbacba";
        boolean actual = solution.areAnagramTwo(firstWord, secondWord);

        assertFalse(actual);
    }
}
