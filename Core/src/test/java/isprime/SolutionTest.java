package isprime;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class SolutionTest.
 * Tests Solution class.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 25.06.2021
 */
public class SolutionTest {
    /**
     * Tests isPrime() method.
     */
    @Test
    public void whenInvokeThenTrue() {
        var solution = new Solution();
        boolean actual = solution.isPrime(5);

        assertTrue(actual);
    }

    /**
     * Tests isPrime() method.
     */
    @Test
    public void whenInvokeThenFalse() {
        var solution = new Solution();
        boolean actual = solution.isPrime(6);

        assertFalse(actual);
    }
}
