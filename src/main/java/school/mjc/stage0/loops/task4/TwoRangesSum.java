package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int skippedSum = 0;
        if (numberToSkip > lastInRow) System.out.println("number to skip is bugger then the last");
        if (lastInRow < 0) System.out.println("last number in row is negative");
        if (lastInRow >= 0 && numberToSkip <= lastInRow) {
            for (int number = 0; number <= lastInRow; number++) {
                if (number > numberToSkip) {
                    sum += number;
                } else {
                    skippedSum += number;
                }
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        }


    }
}
