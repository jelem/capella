package home;

public class TaskThree {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n - i;
        }
    }
}
