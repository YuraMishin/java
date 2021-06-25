package isprime;

/**
 * Class Solution.
 * Implements entity Solution to check if the number is prime.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 25.06.2021
 */
public class Solution {
    /**
     * Method computes the result.
     *
     * @param n N.
     * @return int Result.
     */
    public final boolean isPrime(final int n) {
        boolean result = false;
        int count = 1;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            result = true;
        }
        return result;
    }
}
