class Solution {
    public int[] sortArray(int[] nums) {
     mergesort(nums,0,nums.length-1);
         return nums;
    }
    public static void mergesort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
       while(i<=mid && j<=ei)
       {
                if(arr[i]<arr[j])
                {
                    temp[k]=arr[i];
                    i++;
                }
                else
                {
                    temp[k]=arr[j];
                    j++;
                }  
                k++;
            }
            //left over left part
            while(i<=mid)
            {
                temp[k++]=arr[i++];
            }
            while(j<=ei)
            {
                temp[k++]=arr[j++];
            }
            for(k=0,i=si;k<temp.length;k++,i++)
            {
                arr[i]=temp[k];
            }
        }
    }
