package warmup.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTests {

    private TimeConversion timeConversion;

    @BeforeEach
    public void setup() {
        timeConversion = new TimeConversion();
    }

    @Test
    public void convertAM() {
        String time = "12:01:00AM";
        String expected = "00:01:00";
        String actual = timeConversion.convert(time);
        assertEquals(expected, actual);
    }

    @Test
    public void convertPM() {
        String time = "12:01:00PM";
        String expected = "12:01:00";
        String actual = timeConversion.convert(time);
        assertEquals(expected, actual);
    }

}
