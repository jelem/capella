package home;

public class TaskSix {

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10, 16};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
