//leetcode 852. Peak Index in a Mountain Array

// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int n = arr.length;
//         int base = 0;
//         for (int i=0; i <n;  i++){
//             if(arr[i]> arr[base] ){
//                 base = i ;
//             }
//             else {
//                 continue ;
//             }
//         }

//         return base ;
        
//     }
// }