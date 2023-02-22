public class nthRoot {
    public double pow(double x, int n)
    {
        double ans=1;
        for(int i=0;i<n;i++)
        {
            ans=ans*x;
        }
        return ans;
    }
    public double nthRootOfNum(double x,int n)
    {
        double left=1.0;
        double right=x;
        double mid;
        double error=0.0001;

        while((right-left)>error)
        {
            mid=(left+right)/2.0;
            if(pow(mid,n)>x){
                right=mid;
            }
            else{
                left=mid;
            }
        }


        return left;
    }
    public static void main(String gg[])
    {
        nthRoot nthroot=new nthRoot();
        System.out.println(nthroot.nthRootOfNum(27,2));
    }
}
