public class MedianOfTwoSortedArrays {
    public int[] mergeTwoSortedArray(int []arr1, int[] arr2)
    {
        int[] arr;
        int i;
        int len1=arr1.length;
        int len2=arr2.length;
        arr=new int[len1+len2];
        for(i=0;i<len1;i++) arr[i]=arr1[i];
        int j=0;
        for(i=len1;i<len2+len1;i++) 
        {
            arr[i]=arr2[j];
            j+=1;
        }
        return arr;
    }
    public double getMedian(int[] arr1, int[] arr2)
    {
        double ans=0.0;
        MedianOfTwoSortedArrays m=new MedianOfTwoSortedArrays();
        int arr[]=m.mergeTwoSortedArray(arr1, arr2);
        int len=arr.length;
        if(len%2!=0) ans=arr[(len/2)];
        else ans=(arr[(len/2)]+arr[(len/2)-1])/2.0;
        return ans;
    }
    public static void main(String gg[])
    {
        int[] arr1={1,2,3};
        int[] arr2={4,5};
        MedianOfTwoSortedArrays m=new MedianOfTwoSortedArrays();
        double ans=m.getMedian(arr1, arr2);
        System.out.println(ans);
        
    }
}
