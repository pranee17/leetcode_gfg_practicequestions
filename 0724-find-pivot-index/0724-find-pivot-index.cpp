class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int i,sum=0,leftsum=0;
        for(i=0;i<nums.size();i++)
        {
        sum=sum+nums[i];
        }
         for(i=0;i<nums.size();i++)
        {
        if(leftsum==(sum-leftsum-nums[i]))    
                return i;
                leftsum += nums[i];                         
        }
         return -1;
    }
};