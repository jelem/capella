package home;

public class TaskFour {

    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 23};
        int lol;

        for (int i = 0; i < arr.length; i++) {
            lol = arr[i] % 3;
            if (lol == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
