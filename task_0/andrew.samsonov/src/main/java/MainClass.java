/**
 * Created by User on 10.11.2017.
 */
public class MainClass {

    public static void main(String[] args) {

//        int n = Integer.parseInt(args[0]);
//        int fact = 1;
//        for (int i=1;i<=n;i++){
//            fact *= i;
//        }
//        System.out.println("n! = " + fact);
        int start = 100_000;
        int end = 999_999;

        int count = countLuckyTicket(start,end);
        System.out.println();
        System.out.println("count = " + count);

    }

    private static int countLuckyTicket(int start,int end){
        int count = 0;
            for(int i = start; i<=end;i++){
                if(sum(i%1000)==sum(i/1000)){
                   //System.out.print(i + " ");
                    count++;
                }
            }
        return count;
    }

    private static int sum(int numbers){

        int sum = 0;
        while(numbers != 0){
            sum = sum + numbers%10;
            numbers = numbers/10;
        }
        return  sum;
    }
}
