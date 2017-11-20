package home;

public class TaskSeven {

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10, 16};
        int sum = 0;
        int medium;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        medium = sum / arr.length;
        System.out.println(medium);
    }
}