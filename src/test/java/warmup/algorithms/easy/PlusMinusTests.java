package warmup.algorithms.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private PlusMinus plusMinus;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        plusMinus = new PlusMinus();
    }

    @Test
    public void printRatios() {
        int[] array = new int[]{1, 1, 0, -1, -1};
        String positivesRatio = "0.400000\n";
        String negativesRatio = "0.400000\n";
        String zeroesRatio = "0.200000\n";
        String expected = positivesRatio + negativesRatio + zeroesRatio;
        plusMinus.printRatios(array);
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
