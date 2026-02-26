//leetcode 1672. Richest Customer Wealth

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int max = Integer.MIN_VALUE ;
//         int n = accounts.length ;
        
//         int[] sums = new int[n];
//         int i = 0 ; 
//         int m = accounts[i].length ;
//         while(i < n){
//             int sum = 0 ;
//             for(int num : accounts[i] ){
//                 sum += num ;
                

//             }
//             sums[i] = sum ;
//              i++ ;
//         }
//         for ( int j = 0 ; j <sums.length ; j++){
//             if(sums[j] > max ){
//                 max = sums[j];
//             }
//             else continue ;
//         }
//       return max ;  
//     }
// }