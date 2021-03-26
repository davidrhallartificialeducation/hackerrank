package implementation.algorithms.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleAndOrangeTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private AppleAndOrange appleAndOrange;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        appleAndOrange = new AppleAndOrange();
    }

    @Test
    public void count() {
        int appleTreeX = 4;
        int houseStartX = 5;
        int houseEndX = 7;
        int orangeTreeX = 9;
        int[] appleFallDistances = new int[]{1, 2, -1, -2};
        int[] orangeFallDistances = new int[]{-2, 2, -1, 1};
        appleAndOrange.printCount(houseStartX, houseEndX, appleTreeX, orangeTreeX, appleFallDistances, orangeFallDistances);
        String actual = outContent.toString();
        String expected = "2\n1\n";
        assertEquals(expected, actual);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
