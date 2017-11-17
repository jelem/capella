package home;

public class TaskFive {

    public static void main(String[] args) {
        int[] arr = {2, 9, 10, 67, 88, 13};
        int lol;

        for (int i = 0; i < arr.length; i++) {
            lol = arr[i] % 2;
            if (lol == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
