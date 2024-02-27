import java.util.*;
public class Missing{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        int s=read.nextInt();
        int[] arr=new int[s-1];
        int sum=0;
        int fact=0;
        for(int i=0;i<s-1;i++)
        
        {
            arr[i]=read.nextInt();
           sum +=arr[i];
           //fact*=i;
        }
        for(int i=1;i<=s;i++)
        {
            fact+=i;
        }
        
        System.out.println(Math.abs(fact-sum));
    }
}