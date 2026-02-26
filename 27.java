//leetcode 27. Remove Element
// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int top = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 nums[top] = nums[i];
//                 top++;
//             }
//         }

//         return top; 
//     }
// }