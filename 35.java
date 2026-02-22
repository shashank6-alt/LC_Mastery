//Leetcode 35. Search Insert Position
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int n = nums.length -1;
//         int ans = 0 ;
//         for( int i = 0 ; i <=n ; i++){
//             if(nums[i] == target ){
//                ans = i ;
//                break ;
//             }
//             else if(nums[i] < target && target< nums[n]){
//                 ans = i + 1 ;
                
//             }
//             else if (nums[n]< target){
//                 ans = n+1 ;
//                 break ;
//             }
//             else{
//                 continue ;
//             }
//         }
//       return ans ;  
//     }
// }