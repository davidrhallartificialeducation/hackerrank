package implementation.algorithms.easy;

/**
 * A class with the single responsibility of
 * determining whether an apple would fall on a home
 * based on it's fall distance and the tree's position
 */
public class AppleAndOrange {

    /**
     * <pre>
     * {@code
     * int appleTreeX = 4;
     * int houseStartX = 5;
     * int houseEndX = 7;
     * int orangeTreeX = 9;
     * int[] appleFallDistances = new int[]{1, 2, -1, -2};
     * int[] orangeFallDistances = new int[]{-2, 2, -1, 1};
     * appleAndOrange.printCount(houseStartX, houseEndX, appleTreeX, orangeTreeX, appleFallDistances, orangeFallDistances);
     * // 2
     * // 1
     * }
     * </pre>
     * @param houseStartX Starting position of the house
     * @param houseEndX Ending position of the house
     * @param appleTreeX Position of the apple tree
     * @param orangeTreeX Position of the orange tree
     * @param appleFallDistances The distance each apple fell from the tree
     * @param orangeFallDistances The distance each orange fell from the tree
     */
    public void printCount(int houseStartX, int houseEndX, int appleTreeX, int orangeTreeX, int[] appleFallDistances, int[] orangeFallDistances) {
        int applesThatHitHouse = countInRange(houseStartX, houseEndX, appleTreeX, appleFallDistances);
        int orangesThatHitHouse = countInRange(houseStartX, houseEndX, orangeTreeX, orangeFallDistances);
        System.out.println(applesThatHitHouse);
        System.out.println(orangesThatHitHouse);
    }

    private int countInRange(int rangeStart, int rangeEnd, int start, int[] rangeModifiers) {
        int totalInRange = 0;
        for (int rangeModifier : rangeModifiers) {
            int finalPosition = start + rangeModifier;
            boolean inRange = inInclusiveRange(rangeStart, rangeEnd, finalPosition);
            if (inRange) {
                totalInRange += 1;
            }
        }
        return totalInRange;
    }

    private boolean inInclusiveRange(int rangeStart, int rangeEnd, int value) {
        return value >= rangeStart && value <= rangeEnd;
    }

}
