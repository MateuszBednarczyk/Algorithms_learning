package algorithm;

public class SelectSort {
    public int[] Algorithm(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int minSlot = 0;
            int temp = min;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minSlot = j;
                }
            }

            data[i] = min;

            if (minSlot != 0) {
                data[minSlot] = temp;
            }
        }

       return data;
    }
}
