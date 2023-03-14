class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
          int n= arr.size(),a;
        for(int i=0;i<n;i++)
        {
            a+=(arr[i])*(((i+1)*(n-i)+1)/2);
        }
        return a;
    }
};