import java.util.HashSet;
import java.util.Set;

class SingleNumber
{
    int getSingleNumber(int[] intArray)
    {
        Set <Integer> set=new HashSet<>();

        int ans;
        for(int i=0;i<intArray.length;i++)
        {
            if(set.contains(intArray[i])) set.remove(intArray[i]);
            else set.add(intArray[i]);
    
        }
        
        ans=set.iterator().next();
        
        return ans;
    }
    public static void main(String gg[])
    {
        int[] arr=new int[]{1,2,3,3,2,1,5,5,3};
        SingleNumber sn=new SingleNumber();
        int ans=sn.getSingleNumber(arr);
        System.out.println(ans);

        
    }
}
//[1,2,1,3,2]
//output should be 3 since it is not getting repeated.
