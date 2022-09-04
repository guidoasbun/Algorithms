package ValidSequence;

import java.util.List;

public class ValidSequence {

  public static boolean isValidSequence(List<Integer> array, List<Integer> sequence) {
    // O(n) time | O(1) space
    int arrayIndex = 0;
    int sequenceIndex = 0;
    int arraySize = array.size();
    int sequenceSize = sequence.size();

    while (arrayIndex < arraySize && sequenceIndex < sequenceSize) {
      if (array.get(arrayIndex) == sequence.get(sequenceIndex)) {
        sequenceIndex++;
      }
      arrayIndex++;
    }

    return sequenceIndex == sequenceSize;
  }

  public static boolean isValidSequence2(List<Integer> array, List<Integer> sequence) {
    // O(n) time | O(1) space
    int sequenceIndex = 0;
    int sequenceSize = sequence.size();

    for (int value : array) {
      if (sequenceIndex == sequenceSize) {
        break;
      }
      if (value == sequence.get(sequenceIndex)) {
        sequenceIndex++;
      }
    }

    return sequenceIndex == sequenceSize;
  }
}
