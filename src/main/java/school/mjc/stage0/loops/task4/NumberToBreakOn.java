package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) System.out.println("iterating till the end");
        for (int number = 1; number <= numberToGoUntil; number++) {
            if (number <= toBreakWith) System.out.println(number);
            else break;
        }
    }
}
