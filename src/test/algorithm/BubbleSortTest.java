package test.algorithm;

import algorithm.BubbleSort;

public class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    public void BubbleSort() {
        //given
        int[] given = new int[]{99, 1, 8, 100};
        int[] wanted = new int[]{1, 8, 99, 100};

        //when
        int[] got = bubbleSort.Algorithm(given);

        //then
        Test.checkTestStatus(wanted, got, new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName());
    }
}
