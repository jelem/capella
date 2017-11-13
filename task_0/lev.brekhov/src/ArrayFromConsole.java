import java.util.Scanner;

public class ArrayFromConsole {
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt(); 
        int array[] = new int[length];
        System.out.println("Enter elements: ");
        
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.print(array[i] + " ");
        }
    }
}