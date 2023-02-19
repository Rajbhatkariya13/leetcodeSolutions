public class palindromeNumber {
        public boolean isPalindrome(int x) {
            int num=x;
            int reversed=0;
            if(x<0) return false;
            while(x!=0)
            {
                reversed=reversed*10+x%10;
                x=x/10;
            }
            return reversed==num;
        }
        public static void main(String gg[])
        {

            palindromeNumber p=new palindromeNumber();
            boolean b= p.isPalindrome(121);
            System.out.println(b);
        }
    
}
