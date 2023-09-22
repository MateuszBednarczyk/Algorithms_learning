package algorithm;

public class BubbleSort {
    public int[] Algorithm(int[] data) {
        for (int j = 0; j < data.length; j++) {
            boolean isElementSwapped = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int lower = data[i + 1];
                    int higher = data[i];

                    data[i] = lower;
                    data[i + 1] = higher;

                    isElementSwapped = true;
                } else {
                    isElementSwapped = false;
                }
            }

            if (!isElementSwapped) {
                break;
            }
        }

        return data;
    }
}
