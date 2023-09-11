public class Main {
    public static void main(String[] args) {
        int[] data = {9,8,1,2,33,55,1};
        bubbleSort(data);
        for (int i : data) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int lower = arr[i + 1];
                    int higher = arr[i];

                    arr[i] = lower;
                    arr[i + 1] = higher;
                }
            }
        }
    }
}