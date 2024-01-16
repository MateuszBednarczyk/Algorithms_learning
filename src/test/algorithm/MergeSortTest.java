package test.algorithm;

import algorithm.InsertionSort;
import algorithm.MergeSort;
import algorithm.Type;

import java.util.ArrayList;
import java.util.List;

public class MergeSortTest {
    private final MergeSort mergeSort = new MergeSort();

    public void MergeSort() {
        //given
        List<int[][]> tests = new ArrayList<>();
        tests.add(new int[][]{{100, 99, 1, 8}, {1, 8, 99, 100}});
        tests.add(new int[][]{{7, 10000, 2, 5, 91}, {2, 5, 7, 91, 10000}});

        //when
        //then
        for (int[][] test : tests) {
            int[] got = mergeSort.Algorithm(test[0]);
            Test.checkTestStatus(test[1], got, new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), Type.SORTING);
        }
    }
}
