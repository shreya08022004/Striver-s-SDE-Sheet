class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,s=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            if(s>maxi)
            {
                maxi=s;
            }
            if(s<0)
            {
                s=0;
            }
        }
        return maxi;
    }
}
