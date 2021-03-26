package warmup.algorithms.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTheTripletsTests {

    private CompareTheTriplets compareTheTriplets;

    @BeforeEach
    public void setup() {
        compareTheTriplets = new CompareTheTriplets();
    }

    @Test
    public void score() {
        List<Integer> candidateAScores = Arrays.asList(17, 28, 30);
        List<Integer> candidateBScores = Arrays.asList(99, 16, 8);
        List<Integer> expected = Arrays.asList(2, 1);
        List<Integer> actual = compareTheTriplets.score(candidateAScores, candidateBScores);
        assertEquals(expected, actual);
    }

}
