import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack <String> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            String ch = String.valueOf(s.charAt(i));
            if(ch.equals("{")|| ch.equals("[")|| ch.equals("("))
            {
                st.push(ch);
                continue;
            }
            if(st.isEmpty())
            {
                return false;
            }
            if(")".equals(ch))
            {
                if("(".equals(st.pop()))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            if("]".equals(ch))
            {
                if("[".equals(st.pop()))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            if("}".equals(ch))
            {
                if("{".equals(st.pop()))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }  
         if(st.isEmpty())
                return true;
            else
                return false;
    }
}