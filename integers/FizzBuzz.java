import java.util.ArrayList;
import java.util.List;
class FizzBuzz
{
    public List<String> fizzBuzz(int n)
    {
        List<String> fizzBuzzList;
        fizzBuzzList=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0){
                fizzBuzzList.add("FizzBuzz");
            }else if(i%3==0)
            {
                fizzBuzzList.add("Fizz");

            }else if(i%5==0)
            {
                fizzBuzzList.add("Buzz");

            }else
            {
                fizzBuzzList.add(Integer.toString(i));
            }
        }

        return fizzBuzzList;
    }
    public static void main(String gg[])
    {   FizzBuzz fb=new FizzBuzz();
        List<String> list=fb.fizzBuzz(15);
        for(String str:list) System.out.println(str);

    }
}
//it will take O(n) and space will O(n)