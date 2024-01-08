class Solution {
    public double myPow(double x, int n) {   
        if(n==0)
        {
          return 1;
        }
        long N =n;
        if(N<0) 
        {
          N = -N;
          x = 1/x;
        }
 
        double halfpower=myPow(x,(int)(N/2));
        double halfpowsq=halfpower*halfpower;
        if(N%2!=0) 
        {
          halfpowsq=x*halfpowsq;
        }
       return halfpowsq;
    }
}