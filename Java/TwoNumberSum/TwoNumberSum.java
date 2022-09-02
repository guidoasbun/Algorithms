package Java.TwoNumberSum;

class TwoNumberSum {

    public static int[] twoNumberSum1(int[] array, int targetSum) {
      //O(n^2) time | O(1) space
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
          int firstNumber = array[i];
          for (int j = i + 1; j < arrayLength; j++) {
            int secondNumber = array[j];
            if (firstNumber + secondNumber == targetSum) {
              return new int[] {firstNumber, secondNumber};
            }
          }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
      // Write your code here.
      return new int[0];
  }

    public static int[] twoNumberSum3(int[] array, int targetSum) {
        // Write your code here.
        return new int[0];
    }

    public static char[] twoNumberSum1(int i, int j, int k, int l) {
      return null;
    }

    public static void print(int[] array) {
      System.out.print("[");
      for (int i : array) {
        System.out.print(i + " ");
      }
      System.out.println("]");
    }
}
