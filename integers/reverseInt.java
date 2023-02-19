class reverseInt
{
public int reverseInt(int x)
{
int reversed=0;
int min=Integer.MIN_VALUE;
int max= Integer.MAX_VALUE;
int lastDigit;

while(x!=0)
{
    lastDigit=x%10;
    if(reversed>max/10 || (reversed == max/10 && lastDigit>7)) return 0;
    if(reversed<min/10 || (reversed == min/10 && lastDigit<-8)) return 0;
    reversed=reversed*10+lastDigit;
    x=x/10;
}
return reversed;
}
public static void main(String gg[])
{

reverseInt rs=new reverseInt();
int ans=rs.reverseInt(-21474836);
System.out.println(ans);

}

}

//tc O(logn) sc: O(1)
