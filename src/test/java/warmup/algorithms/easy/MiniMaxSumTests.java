package warmup.algorithms.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniMaxSumTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private MiniMaxSum miniMaxSum;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        miniMaxSum = new MiniMaxSum();
    }

    @Test
    public void printMinSumAndMaxSum() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        miniMaxSum.printMinSumAndMaxSum(array);
        String expected = "16 24\n";
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void failedTestCase() {
        int[] array = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum.printMinSumAndMaxSum(array);
        String expected = "2063136757 2744467344\n";
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
