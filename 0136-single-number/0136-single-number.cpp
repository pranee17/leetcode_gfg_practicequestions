class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int i;
        sort(nums.begin(),nums.end());
        for(i=0;i<size(nums);)
        {
        if((i!=size(nums)-1)&&(nums[i]==nums[i+1]))
        {
           i+=2;
        }
        else
        {
            return nums[i];
        }
        }
        return (size(nums)-1);
    }
};