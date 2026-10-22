class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int a = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=(nums.length-1);j>i;j--)
            {
                if((nums[i]+nums[j])==target)
                {
                ans[a]=i;
                ans[a+1]=j;
                }
            }
        }
        return ans;
    }
}
