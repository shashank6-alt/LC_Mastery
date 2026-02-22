//LeetCode 162. Find Peak Element
// class Solution {
//     public int findPeakElement(int[] nums) {
//           int n = nums.length;
//         int base = 0;
//         for (int i=0; i <n;  i++){
//             if(nums[i]> nums[base] ){
//                 base = i ;
//             }
//             else {
//                 continue ;
//             }
//         }

//         return base ;
        
//     }
// }