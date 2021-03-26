package warmup.algorithms.easy;

import java.util.List;

import static java.util.Collections.frequency;
import static java.util.Collections.max;

/**
 * A class with the single responsibility of performing
 * arithmetic operations on candle sizes
 */
public class BirthdayCakeCandles {

    /**
     * <pre>
     * {@code
     * List<Integer> candles = Arrays.asList(3, 2, 1, 3);
     * birthdayCakeCandles.frequencyOfTallestCandle(candles);
     * // 2
     * }
     * </pre>
     * @param candles A list of integers each representing the size of a candle
     * @return The frequency of the largest sized candle in the List
     */
    public int frequencyOfTallestCandle(List<Integer> candles) {
        int largestCandleSize = max(candles);
        return frequency(candles, largestCandleSize);
    }

}
