package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted >= 1) {
            for (int counter = 1; counter <= lastPrinted; counter++) {
                if (counter % 3 == 0) continue;
                System.out.println(counter);
            }
        }

    }
}
