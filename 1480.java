//leetcode 1480. Running Sum of 1d Array

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int i =  1;
//         for (int j = 1 ; j < nums.length ; j++){
//             nums[i] = nums[i-1] + nums[j];
//             i++;


//         }
//      return nums ;    
//     }
// }