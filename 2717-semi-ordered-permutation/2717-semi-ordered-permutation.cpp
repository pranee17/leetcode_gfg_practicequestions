class Solution {
public:
    int semiOrderedPermutation(vector<int>& nums) {
        int n=nums.size();
        int indx1=0;
        int indxn=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                indx1=i;
            }
            if(nums[i]==n)
            {
                indxn=i;
            }
        }
        int ans=indx1+n-indxn-1;
        if(indxn<indx1)
        {
            ans--;
        }
        return ans;
        
        
    }
};