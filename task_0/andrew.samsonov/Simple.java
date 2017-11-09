public class Simple{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[3];
		
		System.out.println("Please, enter some integer number");
		System.out.print("First: ");	
		array[0] = scanner.nextInt();	
		System.out.println();
		System.out.print("Second: ");	
		array[1] = scanner.nextInt();	
		System.out.println();
		System.out.print("Third: ");	
		array[2] = scanner.nextInt();	
		System.out.println();
		System.out.print("Your array: ");
		for(int i:array){
			System.out.print(i);
		}
	}
}
