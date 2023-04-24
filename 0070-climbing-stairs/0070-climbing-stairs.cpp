class Solution {
public:
    int climbStairs(int n) {
        //fibanocci series
        if(n<=2)
        {
            return n;
        }
        int fnm1=2,fnm2=1,fn;
        for(int i=3;i<=n;i++)
        {
            fn=fnm1+fnm2;
            fnm2=fnm1;
            fnm1=fn;    
        }
        return fn;
    }
};