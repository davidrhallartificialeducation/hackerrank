package warmup.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTests {

    private ArraySum array;

    @BeforeEach
    public void setup() {
        array = new ArraySum();
    }

    @Test
    public void sum() {
        int[] arr = new int[]{1, 2, 4};
        int expected = 7;
        int result = array.sum(arr);
        assertEquals(expected, result);
    }

}
