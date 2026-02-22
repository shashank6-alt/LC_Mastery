#Leetcode 485. Max Consecutive Ones
# class Solution:
#     def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
#         curr = ans = 0
#         for n in nums:
#             curr = curr + 1 if n == 1 else 0
#             ans = max(ans, curr)
#         return ans