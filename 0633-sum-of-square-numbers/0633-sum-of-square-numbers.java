class Solution {
    public boolean judgeSquareSum(int c) {
        long lp =0;
        long rp= (long)Math.sqrt(c);
        while(lp<=rp)
        {
            long currsum=lp*lp+rp*rp;
            if(currsum<c)
            {
                lp++;
            }
            else if (currsum>c)
            {
                rp--;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    
}