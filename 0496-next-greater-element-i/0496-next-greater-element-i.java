class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s =new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
        while(!s.isEmpty() && s.peek()<=nums2[i]){
            s.pop();
        }
            if(s.isEmpty()){
               map.put(nums2[i],-1);
            }else{
               map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=map.get(nums1[j]);
        }
        return nums1;
    }
}