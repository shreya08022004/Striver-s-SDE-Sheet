class Solution:
    def sortColors(self, nums: List[int]) -> None:
        z=[x for x in nums if x==0]
        o=[x for x in nums if x==1]
        t=[x for x in nums if x==2]
        for i in range(len(z)):
            nums[i]=0
        for i in range(len(z),len(o)+len(z)):
            nums[i]=1
        for i in range(len(o)+len(z),len(nums)):
            nums[i]=2
