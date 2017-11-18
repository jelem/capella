package home;

public class TaskTwo {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];

        for (int i = 0; i < args.length; i++) {
            arr[i] = i + 1;
        }
    }
}
