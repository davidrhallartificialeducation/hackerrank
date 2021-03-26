package warmup.algorithms.easy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * A class with the single responsibility of
 * converting AM/PM time to military standard
 */
public class TimeConversion {

    /**
     * <pre>
     * {@code
     * String currentTime = "03:45:16PM";
     * timeConversion.convert(currentTime);
     * // 15:45:16
     * }
     * </pre>
     * @param time a timestamp in HH:MM:SSAM|PM format
     * @return a timestamp in military standard
     */
    public String convert(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));

        String period = time.substring(time.length() - 2);

        if (period.equals("PM") && hours != 12) {
            hours += 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours % 24, minutes, seconds);
    }

}
