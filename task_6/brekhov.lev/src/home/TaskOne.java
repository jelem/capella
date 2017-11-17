package home;

public class TaskOne {

    public static void main(String... args) {
            int[] elem = new int[10];

            for (int i = 0; i < elem.length; i++) {
                elem[i] = i + 1;
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(elem[i]);
            }
    }
}