package warmup.algorithms.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaircaseTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private Staircase staircase;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        staircase = new Staircase();
    }

    @Test
    public void printStaircase() {
        int stairs = 4;
        String expected = "   #\n  ##\n ###\n####\n";
        staircase.printStaircase(stairs);
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
