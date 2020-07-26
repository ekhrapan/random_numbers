package academy.belhard.util;

import java.util.Random;

public class RandomNumberUtil {
    private static final int NUMBER_FROM = 1;
    private static final int NUMBER_TO = 10;

    public static int get() {
        Random random = new Random();

        return random.nextInt(NUMBER_TO) + NUMBER_FROM;
    }
}
