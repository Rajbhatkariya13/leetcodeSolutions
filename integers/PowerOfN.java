public class PowerOfN {
    public double powerOfNum(int x, int n)
    {
        double ans=1.0;
        double num=n;
        if(num<0) num*=-1;
        while(num>0)
        {
            if(num%2==0)
            {
                x=x*x;
                num/=2;
            }
            else{
                ans*=x;
                num-=1;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;

    }
    public static void main(String gg[])
    {
        PowerOfN p=new PowerOfN();
        System.out.println(p.powerOfNum(3, -3));
    }
}
