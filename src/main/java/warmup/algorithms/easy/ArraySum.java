package warmup.algorithms.easy;

/**
 * A class with the single responsibility of performing arithmetic operations
 * on an array.
 */
public class ArraySum {

    /**
     * <pre>
     * {@code
     * int[] myArray = new int[]{1, 2, 3};
     * ArraySum array = new ArraySum();
     * int result = array.sum(myArray);
     * System.out.println(result) // 6
     * }
     * </pre>
     * @param array An array of integers
     * @return The sum of all integers within the array
     */
    public int sum(int[] array) {
        int sum = 0;
        for (int integer : array) {
            sum += integer;
        }
        return sum;
    }

}
