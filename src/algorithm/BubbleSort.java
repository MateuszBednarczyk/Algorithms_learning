package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public int[] Algorithm(int[] data) {
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int lower = data[i + 1];
                    int higher = data[i];

                    data[i] = lower;
                    data[i + 1] = higher;
                }
            }
        }
        return data;
    }
}
