//leetcode 287. Find the Duplicate Number
// class Solution {
//     public int findDuplicate(int[] nums) {

//         quickSort(nums, 0, nums.length - 1);

//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }

//     private void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int p = partition(arr, low, high);
//             quickSort(arr, low, p - 1);
//             quickSort(arr, p + 1, high);
//         }
//     }

//     private int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;

//         for (int j = low; j < high; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1;
//     }
// }