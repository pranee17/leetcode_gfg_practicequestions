class Solution {
public:
    int strStr(string haystack, string needle) {
        int h = haystack.size();
        int n = needle.size();
        int index=-1;
        for(int i =0;i<h;i++)
        {
            string temp=haystack.substr(i,n);
            if(temp==needle)
            {
                index=i;
                break;
            }
        }
        return index;
    }
};