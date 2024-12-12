package at.kos.projects.algorithms.dataGenerator;

import java.util.Random;

public class DataGenerator {

    private int[] array;

    public DataGenerator() {
        Random random = new Random();

        int size = random.nextInt(16) + 5;

        int min = -100;
        int max = 100;

        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public int[] getArray() {
        return array;
    }
}
