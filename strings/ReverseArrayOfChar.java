class ReverseArrayOfChar
{
    char[] getReversedArray(char[] s)
    {
        char g;
        int start=0;
        int end=s.length-1;
        while(start<end)
        {
            g=s[start];
            s[start]=s[end];
            s[end]=g;
            start++;
            end--;
        }
        return s;
    }

    public static void main(String gg[])
    {
        ReverseArrayOfChar r=new ReverseArrayOfChar();
        char c[]={'a','b','c','d'};
        System.out.println(r.getReversedArray(c));

    }
}