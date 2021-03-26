package warmup.algorithms.easy;

import java.util.Collections;

/**
 * A class with the single responsibility of printing
 * staircases
 */
public class Staircase {

    /**
     * <pre>
     * {@code
     * int stairs = 4;
     * staircase.printStaircase(stairs);
     * //   #
     * //  ##
     * // ###
     * //####
     * }
     * </pre>
     * @param stairs The number of stairs required to reach the top of the staircase
     */
    public void printStaircase(int stairs) {
        for (int row = 1; row <= stairs; row++) {
            String format = "%" + String.valueOf(stairs) + "s\n";
            System.out.printf(format, String.join("", Collections.nCopies(row, "#")));
        }
    }

}
