package TwoNumberSum;

public class Test {
  public static void main(String[] args) {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum = 10;

    int[] result = TwoNumberSum.twoNumberSum1(array, targetSum);

    TwoNumberSum.print(result);
  }
}
