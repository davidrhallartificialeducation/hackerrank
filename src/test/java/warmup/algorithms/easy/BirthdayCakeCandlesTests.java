package warmup.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayCakeCandlesTests {

    private BirthdayCakeCandles birthdayCakeCandles;

    @BeforeEach
    public void setup() {
        birthdayCakeCandles = new BirthdayCakeCandles();
    }

    @Test
    public void frequencyOfTallestCandle() {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        int expected = 2;
        int actual = birthdayCakeCandles.frequencyOfTallestCandle(candles);
        assertEquals(expected, actual);
    }

}
