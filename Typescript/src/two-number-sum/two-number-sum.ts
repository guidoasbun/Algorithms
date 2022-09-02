/**
 *
 * @param array non-empty array of distinct integers
 * @param targetSum an integer
 * @returns array of two integers if solution exists, otherwise empty array
 */

const twoNumberSum = (array: number[], targetSum: number): number[] => {
  // O(n^2) time | O(1) space
  const arrayLength: number = array.length;

  for (let i = 0; i < arrayLength - 1; i++) {
    const firstNumber = array[i];
    for (let j = i + 1; j < arrayLength; j++) {
      const secondNumber = array[j];
      if (firstNumber + secondNumber === targetSum) {
        return [firstNumber, secondNumber];
      }
    }
  }
  return [];
};

const twoNumberSum2 = (array: number[], targetSum: number): number[] => {
  // O(n) time | O(n) space
  const hashTable = new Map<number, boolean>();

  for (const number of array) {
    const potentialMatch = targetSum - number;
    if (hashTable.has(potentialMatch)) {
      return [potentialMatch, number];
    } else {
      hashTable.set(number, true);
    }
  }

  return [];
};

const twoNumberSum3 = (array: number[], targetSum: number): number[] => {
  // O(nlog(n)) time | O(1) space
  array.sort((a, b) => a - b);
  let left = 0;
  let right = array.length - 1;

  while (left < right) {
    const currentSum = array[left] + array[right];
    if (currentSum === targetSum) {
      return [array[left], array[right]];
    } else if (currentSum < targetSum) {
      left++;
    } else if (currentSum > targetSum) {
      right--;
    }
  }
  return [];
};

export { twoNumberSum, twoNumberSum2, twoNumberSum3 };
