import java.util.*;

public class LongestSubstringWithoutRepChar
{
    int getUniqueSubstring(String s)
    {   
        int ans=0;
        int left=0;
        int right;
        char ch;
        Map<Character,Integer> hmap=new HashMap<>();
        for(right=0;right<s.length();right++)
        {
            ch=s.charAt(right);
            if(!hmap.containsKey(ch))
            {
               hmap.put(ch, right);
            }else
            {
                left=Math.max(left,hmap.get(ch)+1);
                hmap.put(ch, right);
            }
            ans=Math.max(ans, (right-left)+1);
        }

        return ans;
    }
    public static void main(String gg[])
    {
        LongestSubstringWithoutRepChar l=new LongestSubstringWithoutRepChar();
        int i=l.getUniqueSubstring("bbbbb");
        System.out.println(i);
    }
}