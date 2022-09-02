import { twoNumberSum, twoNumberSum2, twoNumberSum3 } from "./two-number-sum";

const array1: number[] = [3, 5, -4, 8, 11, 1, -1, 6];
const targetSum1: number = 10;

const array2: number[] = [4, 6];
const targetSum2: number = 10;

const array3: number[] = [4, 6, 1];
const targetSum3: number = 5;

const array4: number[] = [4, 6, 1, -3];
const targetSum4: number = 3;

const array5: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const targetSum5: number = 17;

console.log("Solution 1: ", twoNumberSum(array1, targetSum1));
console.log("Solution 2: ", twoNumberSum2(array1, targetSum1));
console.log("Solution 3: ", twoNumberSum3(array1, targetSum1));
