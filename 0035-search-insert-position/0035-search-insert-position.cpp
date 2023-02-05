class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int i;
        for(int i=0;i<size(nums);i++)
        {
            if(target==nums[i])
            {
                return i;
            }
            else
            {
                if(target<nums[i])
                {
                    return i;
                }
            }
        }
        return size(nums);
    }
};