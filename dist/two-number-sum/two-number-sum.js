"use strict";
/**
 *
 * @param array non-empty array of distinct integers
 * @param targetSum an integer
 * @returns array of two integers if solution exists, otherwise empty array
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.twoNumberSum3 = exports.twoNumberSum2 = exports.twoNumberSum = void 0;
const twoNumberSum = (array, targetSum) => {
    // O(n^2) time | O(1) space
    const arrayLength = array.length;
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
exports.twoNumberSum = twoNumberSum;
const twoNumberSum2 = (array, targetSum) => {
    // O(n) time | O(n) space
    const hashTable = new Map();
    for (const number of array) {
        const potentialMatch = targetSum - number;
        if (hashTable.has(potentialMatch)) {
            return [potentialMatch, number];
        }
        else {
            hashTable.set(number, true);
        }
    }
    return [];
};
exports.twoNumberSum2 = twoNumberSum2;
const twoNumberSum3 = (array, targetSum) => {
    // O(nlog(n)) time | O(1) space
    array.sort((a, b) => a - b);
    let left = 0;
    let right = array.length - 1;
    while (left < right) {
        const currentSum = array[left] + array[right];
        if (currentSum === targetSum) {
            return [array[left], array[right]];
        }
        else if (currentSum < targetSum) {
            left++;
        }
        else if (currentSum > targetSum) {
            right--;
        }
    }
    return [];
};
exports.twoNumberSum3 = twoNumberSum3;
