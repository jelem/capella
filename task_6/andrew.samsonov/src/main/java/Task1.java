/**
 * Created by Andrew on 14.11.2017.
 */
public class Task1 {

  public static void main(String[] args) {
    int[] array = new int[10];
    init(array);

    for ( int i = 0; i < 5; i++ ) {
      System.out.print(i + " ");
    }
  }

  private static int[] init(int[] ar){
    for ( int i=0; i < ar.length; i++ ) {
      ar[i]=i;
    }
    return ar;
  }
}
