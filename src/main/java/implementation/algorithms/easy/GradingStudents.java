package implementation.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class with the single responsibility of
 * performing operations on student grades
 */
public class GradingStudents {

    /**
     * <pre>
     * {@code
     * List<Integer> grades = Arrays.asList(73, 67, 38, 33);
     * List<Integer> roundedGrades = gradingStudents.round(grades);
     * System.out.println(roundedGrades);
     * // 75 67 40 33
     * }
     * </pre>
     * @param grades A list of integers ranging from 0-100
     * @return A list of rounded integers based on the professor's rules
     */
    public List<Integer> round(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades) {
            int difference = 5 - (grade % 5);
            if (difference < 3 && grade >= 38) {
                grade += difference;
            }
            roundedGrades.add(grade);
        }
        return roundedGrades;
    }

}
