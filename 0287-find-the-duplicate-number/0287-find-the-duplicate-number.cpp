class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int ans=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int index=nums[i]%n;
            nums[index]+=n;
        }
        for(int i=0;i<n;i++)
        {
            if((nums[i]/n)>=2)
            {
                ans=i;
            }
        }
          return ans;
    }
  
};