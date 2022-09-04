package ValidSequence;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> array1 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence1 = List.of(1, 6, -1, 10);

        // List<Integer> array2 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        // List<Integer> sequence2 = List.of(5, 1, 22, 25, 6, -1, 8, 10);

        // List<Integer> array3 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        // List<Integer> sequence3 = List.of(5, 1, 22, 25, 6, -1, 8, 10);

        System.out.print("Solution 1: ");
        System.out.println(ValidSequence.isValidSequence(array1, sequence1));

        System.out.print("Solution 2: ");
        System.out.println(ValidSequence.isValidSequence2(array1, sequence1));

    }
}
