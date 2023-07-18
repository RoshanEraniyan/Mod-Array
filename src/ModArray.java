import java.util.*;

class Solution
{
    public void calculate(int[] array,int b)
    {
       int power=1,result=0;
        for(int i=array.length-1;i>=0;i--)
        {
            result=(result+((array[i]%b)*power))%b;
            power=(power*10)%b;
        }
        System.out.println(result);
    }
}

class ModArray
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int b=scanner.nextInt();
        Solution solution =new Solution();
        solution.calculate(array,b);
    }
}
