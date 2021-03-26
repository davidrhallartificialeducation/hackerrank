package warmup.algorithms.easy;

import java.util.ArrayList;

import static java.util.Collections.max;
import static java.util.Collections.min;

/**
 * A class with the single responsibility of performing
 * arithmetic operations on an array
 */
public class MiniMaxSum {

    /**
     * <pre>
     * {@code
     * int[] array = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};
     * miniMaxSum.printMinSumAndMaxSum();
     * // 2063136757 2744467344
     * }
     * </pre>
     * @param array an array of integers: negative or positive
     */
    public void printMinSumAndMaxSum(int[] array) {
        ArrayList<Long> sums = new ArrayList<>();
        for (int integer : array) {
            sums.add(this.sumArray(array) - integer);
        }
        long maximum = max(sums);
        long minimum = min(sums);
        String output = String.format("%s %s", minimum, maximum);
        System.out.println(output);
    }

    private long sumArray(int[] array) {
        long sum = 0;
        for (int integer : array) {
            sum += integer;
        }
        return sum;
    }

}
