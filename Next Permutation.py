class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        def swap(i,j):
            while(i<j):
                nums[i],nums[j]=nums[j],nums[i]
                i+=1
                j-=1
        ind=-1
        n=len(nums)
        for i in range(n-2,-1,-1):
            if(nums[i]<nums[i+1]):
                ind=i
                break
        if ind==-1:
            swap(0,n-1)
            return
        else:
            for i in range(n-1,ind,-1):
                if(nums[i]>nums[ind]):
                    temp=nums[i]
                    nums[i]=nums[ind]
                    nums[ind]=temp
                    break
            swap(ind+1,n-1)
