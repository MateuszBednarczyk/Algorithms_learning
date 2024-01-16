package test.algorithm;

import algorithm.MergeSort;
import algorithm.Type;

import java.util.Arrays;

public class Test {

    private final BubbleSortTest bubbleSortTest = new BubbleSortTest();
    private final SelectSortTest selectSortTest = new SelectSortTest();
    private final InsertionSortTest insertionSortTest = new InsertionSortTest();
    private final MergeSortTest mergeSortTest = new MergeSortTest();

    public void runAllTests() {
        bubbleSortTest.BubbleSort();
        selectSortTest.SelectSort();
        insertionSortTest.InsertionSort();
        mergeSortTest.MergeSort();
    }

    public static void checkTestStatus(Object wanted, Object got, String methodName, Type type) {
        if (type == Type.SORTING) {
            if (!Arrays.equals((int[]) wanted, (int[]) got)) {
                System.out.format("%s method failed: Wanted %s, got %s \n",
                        methodName, Arrays.toString((int[]) wanted), Arrays.toString((int[]) got));
            } else {
                System.out.format("%s method passed \n", methodName);
            }
        }
    }
}
