
/**
 * A test class used for testNG examples
 */
public class Counter {

    /**
     * @param input
     * @return the sum of all given items
     */
    public static int countSum(int... input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param input
     * @return the maximum of all given items
     */
    public static int findMax(int... input) {
        int max = 0;
        for (int i : input) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * @param input
     * @return the maximum of all given items
     */
    public static int findMin(int... input) {
        int min = Integer.MAX_VALUE;
        for (int i : input) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
