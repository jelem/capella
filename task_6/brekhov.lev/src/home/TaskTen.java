package home;

public class TaskTen {

    public static void main(String[] args) {
        int[] arr = {5, 4, 0, 2, 4, -3, 6};
        int param = Integer.parseInt(args[0]);
        boolean notParamExist = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == param) {
                notParamExist = true;
                System.out.println("Элемент находится на позиции " + i);
            }
        }
        if (!notParamExist){
            System.out.println("Этого числа нет");
        }
    }
}
