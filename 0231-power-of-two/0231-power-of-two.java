class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==-2147483648 || n == 0) 
        {
            return false;
        }
        return(n&(n-1))==0;
    }
}