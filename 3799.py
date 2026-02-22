# LeetCode 3799. Word Squares II

# class Solution:
#     def wordSquares(self, words: List[str]) -> List[List[str]]:
#         res = []
#         n = len(words)

#         for top in words:
#             for left in words:
#                 if left == top:
#                     continue
#                 # Constraint: top[0] == left[0]
#                 if top[0] != left[0]:
#                     continue

#                 for right in words:
#                     if right in (top, left):
#                         continue
#                     # Constraint: top[3] == right[0]
#                     if top[3] != right[0]:
#                         continue

#                     for bottom in words:
#                         if bottom in (top, left, right):
#                             continue
#                         # Constraints:
#                         # bottom[0] == left[3]
#                         # bottom[3] == right[3]
#                         if bottom[0] == left[3] and bottom[3] == right[3]:
#                             res.append([top, left, right, bottom])

#         res.sort()
#         return res