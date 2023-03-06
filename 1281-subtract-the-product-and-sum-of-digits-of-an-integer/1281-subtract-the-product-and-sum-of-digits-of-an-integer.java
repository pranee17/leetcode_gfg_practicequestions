class Solution {
    public int subtractProductAndSum(int n) {
        int last,product=1,sum=0;
        while(n>0)
        {
            last=n%10;
            product=product*last;
            sum=sum+last;
            n=n/10;
        }
        return (product-sum);
    }
}