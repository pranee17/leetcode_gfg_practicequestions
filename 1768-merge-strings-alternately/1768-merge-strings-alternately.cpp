class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string s;
        int i=0;
        int s1=word1.length();
        int s2=word2.length();
        while(i<s1 && i<s2)
        {
            s.push_back(word1[i]);
            s.push_back(word2[i]);
            i++;     
        }
        while(i<s1)
        {
            s.push_back(word1[i]);
            i++;
        }
        while(i<s2)
        {
            s.push_back(word2[i]);
            i++;
        }
        return s;
    }
};