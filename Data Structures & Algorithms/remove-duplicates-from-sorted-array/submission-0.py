class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        r = 1
        while l < len(nums):
            while r < len(nums) and nums[l] == nums[r]:
                del nums[r]
            l += 1
            r += 1
        return len(nums)

        