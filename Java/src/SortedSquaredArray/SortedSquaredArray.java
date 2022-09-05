package SortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArray {

  public static int[] sortedSquaredArray1(int[] array) {
    // O(nlogn) time | O(n) space
    int arrayLength = array.length;
    int[] result = new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
      result[i] = (int) Math.pow(array[i], 2);
    }
    Arrays.sort(result);

    return result;
  }

  public static int[] sortedSquaredArray2(int[] array) {
    //O(n) time | O(n) space
    int arrayLength = array.length;
    int[] result = new int[arrayLength];
    int start = 0;
    int end = arrayLength - 1;

    for (int i = arrayLength - 1; i >=0 ; i--) {
      int startValue = array[start];
      int endValue = array[end];

      if (Math.abs(startValue) > Math.abs(endValue)) {
        result[i] = (int) Math.pow(startValue, 2);
        start++;
      } else {
        result[i] = (int) Math.pow(endValue, 2);
        end--;
      }
    }

    return result;
  }

  public static void print(int[] array) {
    System.out.print("[");
    for (int i : array) {
        System.out.print(i + " ");
    }
    System.out.println("]");
}

}
