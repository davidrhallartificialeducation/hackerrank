package warmup.algorithms.easy;

import java.util.List;

/**
 * A class with the single responsibility of performing arithmetic operations
 * on a 2D Matrix
 */
public class DiagonalDifference {

    /**
     * <pre>
     * {@code
     * List<Integer> rowOne = Arrays.asList(11, 2, 4);
     * List<Integer> rowTwo = Arrays.asList(4, 5, 6);
     * List<Integer> rowThree = Arrays.asList(10, 8, -12);
     * List<List<Integer>> squareMatrix = Arrays.asList(rowOne, rowTwo, rowThree);
     * int result = diagonalDifference.calculateDifference(squareMatrix);
     * System.out.println(result) // 15
     * }
     * </pre>
     * @param squareMatrix A 2D matrix with columns and rows of equal lengths
     * @return The absolute difference between the sum of the squareMatrix's diagonals
     */
    public int calculateDifference(List<List<Integer>> squareMatrix) {
        int TopLeftToBottomRightDiagonalSum = 0;
        int BottomLeftToTopRightDiagonalSum = 0;
        int squareMatrixSize = squareMatrix.size();
        for (int index = 0; index < squareMatrixSize; index++) {
            int inverseRow = squareMatrixSize - index - 1;
            TopLeftToBottomRightDiagonalSum += squareMatrix.get(index).get(index);
            BottomLeftToTopRightDiagonalSum += squareMatrix.get(inverseRow).get(index);
        }
        int difference = Math.abs(TopLeftToBottomRightDiagonalSum - BottomLeftToTopRightDiagonalSum);
        return difference;
    }

}
