package algorithm;

public class InsertionSort {
    public int[] Algorithm(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int currentVal = data[i];

            int j = i - 1;
            while (j >= 0 && data[j] > currentVal) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = currentVal;
        }
        return data;
    }
}
