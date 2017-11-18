package home;

public class TaskNine {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, -1, -4, 7};
        int mult = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                mult = arr[i] * mult;
            }
        }
    }
}
