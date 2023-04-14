class Solution {
public:
    string addBinary(string a, string b) {
        int carry = 0;
        string sum = "";
        if(a.size()>b.size())
        {
            swap(a,b);
        } 
        int i=a.size()-1;
        int j=b.size()-1;   
        for(;i>=0;i--,j--)
        {
        if ((a[i]=='0')&&(b[j]=='0'))
        {
            if (carry ==1)
            {
                sum='1'+sum;
                carry=0;
            }
            else
            {
               sum='0'+sum; 
            }
        }
        if ((a[i]=='1')&&(b[j]=='0')||(a[i]=='0')&&(b[j]=='1'))
        {
            if(carry==1)
            {
                sum='0'+sum;
            }
            else
            {
                sum='1'+sum;
            }
        }
           
        if ((a[i]=='1')&&(b[j]=='1'))
         {
             if(carry==1)
             {
                 sum='1'+sum;
             }
               else
               {
                   sum='0'+sum;
                   carry=1;
               }
         }
        }
        while(j>=0)
        {
            if(carry==1)
            {
                if(b[j]=='0')
                {
                    sum='1'+sum;
                    carry=0;
                }
                if(b[j]=='1')
                {
                    sum='0'+sum;  
                }
            }
            else
            {
                sum=b[j]+sum;
            }
            j--;
        }
        if(carry==1)
        {
            sum='1'+sum;
        }
        return sum;
    }
};