package warmup.algorithms.easy;

/**
 * A class with the single responsibility of printing
 * mathematical array information
 */
public class PlusMinus {

    /**
     * <pre>
     * {@code
     * int[] array = new int[]{1, 1, 0, -1, -1};
     * plusMinus.printRatios(array);
     * // 0.400000
     * // 0.400000
     * // 0.200000
     * }
     * </pre>
     * @param array An array of positive and negative integers
     */
    public void printRatios(int[] array) {
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberOfZeros = 0;
        for (int integer : array) {
            if (integer > 0) { numberOfPositives += 1; }
            if (integer < 0) { numberOfNegatives += 1; }
            if (integer == 0) { numberOfZeros += 1; }
        }
        float positivesRatio = (float) numberOfPositives / array.length;
        float negativesRatio = (float) numberOfNegatives / array.length;
        float zerosRatio = (float) numberOfZeros / array.length;
        System.out.printf("%.6f%n", positivesRatio);
        System.out.printf("%.6f%n", negativesRatio);
        System.out.printf("%.6f%n", zerosRatio);
    }

}
