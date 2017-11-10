public class Main{
	public static void main(String...args){
		if (args.length == 0){
			System.out.println("...What...???");
			return;
		}
		int n = Integer.parseInt(args[0]);
		System.out.println("factorial of " + n + " is " + factorial(n));
	}

	public static long factorial(int n){
		long fac = 1;
		while (n > 0){
			fac *= n;
			n--;
		}
		return fac;
	}
}