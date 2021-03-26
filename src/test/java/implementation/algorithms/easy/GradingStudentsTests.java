package implementation.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradingStudentsTests {

    private GradingStudents gradingStudents;

    @BeforeEach
    public void setup() {
        gradingStudents = new GradingStudents();
    }

    @Test
    public void round() {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);
        List<Integer> actual = gradingStudents.round(grades);
        assertEquals(expected, actual);
    }

}
