package warmup.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTests {

    private DiagonalDifference diagonalDifference;

    @BeforeEach
    public void setup() {
        diagonalDifference = new DiagonalDifference();
    }

    @Test
    public void calculateDifference() {
        List<Integer> rowOne = Arrays.asList(11, 2, 4);
        List<Integer> rowTwo = Arrays.asList(4, 5, 6);
        List<Integer> rowThree = Arrays.asList(10, 8, -12);
        List<List<Integer>> squareMatrix = Arrays.asList(rowOne, rowTwo, rowThree);
        int expected = 15;
        int actual = diagonalDifference.calculateDifference(squareMatrix);
        assertEquals(expected, actual);
    }

}
