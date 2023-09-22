package test.algorithm;

import algorithm.BubbleSort;
import algorithm.SelectSort;
import algorithm.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectSortTest {
    private final SelectSort selectSort = new SelectSort();

    public void SelectSort() {
        //given
        List<int[][]> tests = new ArrayList<>();
        tests.add(new int[][]{{100, 99, 1, 8}, {1, 8, 99, 100}});
        tests.add(new int[][]{{7, 100, 2, 5, 91}, {2, 5, 7, 91, 100}});

        //when
        //then
        for (int[][] test : tests) {
            int[] got = selectSort.Algorithm(test[0]);

            Test.checkTestStatus(test[1], got, new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), Type.SORTING);
        }
    }
}
