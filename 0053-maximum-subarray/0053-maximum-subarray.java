class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            ms=Math.max(cs,ms);
            cs=Math.max(0,cs);      
        }
        return ms;
    }
}