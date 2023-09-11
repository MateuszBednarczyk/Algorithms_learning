package test.algorithm;

import java.util.Objects;

public class Test {

    private final BubbleSortTest bubbleSortTest = new BubbleSortTest();

    public void runAllTests() {
        bubbleSortTest.BubbleSort();
    }

    public static void checkTestStatus(Object wanted, Object got, String methodName){
        if (Objects.equals(wanted, got)) {
            System.out.format("Wanted %s, got %s", wanted, got);
        } else {
            System.out.println("Passed Test" + methodName);
        }
    }
}
