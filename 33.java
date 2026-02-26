// leetcode 33. Search in Rotated Sorted Array
// class Solution {
//     public int search(int[] nums, int target) {
//         int n = nums.length - 1 ;
//         int ans = -1;
//         for(int i = 0 ; i <= n ; i++){
//             if(nums[i] == target ){
//                 ans = i ;
//             }
//             else {
//                 continue ;
//             } ;
//         }
//       return ans ;  
//     }
// }