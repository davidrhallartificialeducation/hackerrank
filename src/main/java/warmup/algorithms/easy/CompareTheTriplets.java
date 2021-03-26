package warmup.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 * A class with the single responsibility of comparing test scores between two candidates
 * by topic.
 */
public class CompareTheTriplets {

    /**
     * <pre>
     * {@code
     * List<Integer> candidateAScores = Arrays.asList(17, 28, 30);
     * List<Integer> candidateBScores = Arrays.asList(99, 16, 8);
     * List<Integer> result = compareTheTriplets.score(candidateAScores, candidateBScores);
     * System.out.println(result); // 2 1
     * }
     * </pre>
     * @param candidateAScores A list of scores a candidate received in each topic
     * @param candidateBScores A list of scores a candidate received in each topic
     * @return A list comparing candidate A's points to candidate B's.
     */
    public List<Integer> score(List<Integer> candidateAScores, List<Integer> candidateBScores) {
        int candidateATotalScore = 0;
        int candidateBTotalScore = 0;
        for (int index = 0; index < candidateAScores.size(); index++) {
            int candidateATopicScore = candidateAScores.get(index);
            int candidateBTopicScore = candidateBScores.get(index);
            if (candidateATopicScore > candidateBTopicScore) {
                candidateATotalScore += 1;
            } else if (candidateATopicScore < candidateBTopicScore) {
                candidateBTotalScore += 1;
            }
        }
        return Arrays.asList(candidateATotalScore, candidateBTotalScore);
    }

}
