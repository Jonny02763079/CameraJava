package at.kos.projects.algorithms.dataGenerator.Test;

import at.kos.projects.algorithms.dataGenerator.DataGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataGeneratorTest {

    @Test
    public void testArraySize() {
        DataGenerator generator = new DataGenerator();
        int[] array = generator.getArray();

        // Testet ob die Größe des Arrays im Bereich von 5 bis 20 liegt wie ich vorher
        // im code definiert habe
        assertTrue("Array size should be between 5 and 20", array.length >= 5 && array.length <= 20);
    }

    @Test
    public void testArrayValuesInRange() {
        DataGenerator generator = new DataGenerator();
        int[] array = generator.getArray();

        // Testet, dass alle Werte im Array im Bereich von -100 bis 100 liegen --> siehe
        // die Werte min und max im Datagenerator
        for (int value : array) {
            assertTrue("Array value should be between -100 and 100", value >= -100 && value <= 100);
        }
    }

    @Test
    public void testArrayIsRandom() {
        DataGenerator generator1 = new DataGenerator();
        DataGenerator generator2 = new DataGenerator();

        int[] array1 = generator1.getArray();
        int[] array2 = generator2.getArray();

        assertFalse("Arrays should be different", java.util.Arrays.equals(array1, array2));
    }
}
