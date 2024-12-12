package at.kos.projects.algorithms.sortNumberAlgorithm.Test;

import at.kos.projects.algorithms.sortNumberAlgorithm.BubbleSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.InsertionSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.SelectionSort;
import at.kos.projects.algorithms.sortNumberAlgorithm.Sort;
import org.junit.Test;

import org.junit.Assert;

public class SorterTest {

    @Test
    public void testSort() {

        int[] arraysorted = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arrayunsorted = { 6, 5, 7, 2, 1, 4, 3 };
        Sort sorterBubble = new BubbleSort();
        Sort sorterSelection = new SelectionSort();
        Sort sorterInsertion = new InsertionSort();

        Assert.assertArrayEquals(arraysorted, sorterBubble.sort(arrayunsorted));
        Assert.assertArrayEquals(arraysorted, sorterSelection.sort(arrayunsorted));
        Assert.assertArrayEquals(arraysorted, sorterInsertion.sort(arrayunsorted));
    }
}
