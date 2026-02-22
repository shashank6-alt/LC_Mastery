#leetcode 1200. Minimum Absolute Difference
# class Solution(object):
#     def minimumAbsDifference(self, arr):
#         arr.sort()
#         n = len(arr)
#         arr1 = []
#         least = float('inf')

#         for i in range(n - 1):
#             diff = arr[i + 1] - arr[i]
#             least = min(least, diff)
        
#         for i in range(n-1):
#                 if arr[i+1] - arr[i] == least :
#                   arr1.append([arr[i], arr[i+1]])

#         return arr1
 