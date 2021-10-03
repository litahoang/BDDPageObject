package utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();

    public static int nextInt(int max) {
        return RANDOM.nextInt(max);
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static long nextLong(int max) {
        return RANDOM.nextLong();
    }

    public static String nextString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String nextString(String prefix, int length) {
        return prefix.concat(nextString(length));
    }

    public static Object getRandom(Object[] array) {
        int rnd = RANDOM.nextInt(array.length);
        return array[rnd];
    }
}
