package dima.com;

public class ArrayMaker {

  public static void show(int[] array){
    for (int i = 0; i < array.length; i++){
      if ((i + 1) % 10 == 0) {
        System.out.println();
      }
      System.out.print(array[i] + " ");
    }
  }

  public static boolean binarySearch(int[] array, int num){
    int left = 0;
    int right = array.length - 1;

    while (left < right){
      int midlle = (left + right) / 2;
      if (array[left] > num || array[right] < num){
        System.out.println("...not found...");
        return false;
      }
      if (array[left] == num || array[midlle] == num || array[right] == num){
        return true;
      }else if (array[midlle] < num){
        left = midlle + 1;
        System.out.println("...to right...");
      }else if (array[midlle] > num){
        right = midlle - 1;
        System.out.println("...to left...");
      }
    }
    return false;
  }

  public static boolean isSummInArray(int[] array, int sum){

   for (int i = 0; i < array.length - 1; i++){
     if (array[i] > sum){
       break;
     }
     for (int j = i + 1; i < array.length; j++){
        if (array[j] > sum){
          break;
        }
        if (array[i] + array[j] == sum){
          return true;
        }
     }
   }

   return false;
  }

  public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
    int[] rez = new int[arr1.length + arr2.length];

    int j = 0, k = 0;
    for (int i = 0; i < rez.length; i++){
      if (j < arr1.length && k < arr2.length){
        if (arr1[j] < arr2[k]){
          rez[i] = arr1[j];
          j++;
        }else{
          rez[i] = arr2[k];
          k++;
        }
      }else if (arr1.length > arr2.length){
        rez[i] = arr1[j];
        j++;
      }else{
        rez[i] = arr2[k];
        k++;
      }

    }

    return rez;
  }
}
