public class LongestCommonPrefix {
    String longestComminPrefix(String []arr)
    {
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
        }
    public static void main(String gg[]) 
    {
        LongestCommonPrefix l=new LongestCommonPrefix();
        String str[]={"leetcode","leet","leave","leaf","leela"};
        String ans=l.longestComminPrefix(str);
        System.out.println(ans);
    }
}
