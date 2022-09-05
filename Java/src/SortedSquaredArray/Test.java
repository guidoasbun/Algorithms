package SortedSquaredArray;

public class Test {
  public static void main(String[] args) {

    int[] array = new int[] {-7, -3, 1, 9, 22, 30};

    int[] solution1 = SortedSquaredArray.sortedSquaredArray1(array);
    int[] solution2 = SortedSquaredArray.sortedSquaredArray2(array);

    System.out.print("Solution 1: ");
    SortedSquaredArray.print(solution1);
    System.out.print("Solution 2: ");
    SortedSquaredArray.print(solution2);

  }
}
