package home;

public class TaskEight {

    public static void main(String[] args) {
        int[] arr = {4, -7, 1, 0, 7};
        int max = arr[0];
        int min = arr[0];
        int sum;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        sum = max + min;
        System.out.println(sum);
    }
}
