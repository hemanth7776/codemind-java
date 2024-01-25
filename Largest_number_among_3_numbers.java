import java.util.*;
public class Nmber
{
    public static void main(String[] args)
    {
        Scanner read =new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        if(a>b&&a>c)
        System.out.println(a);
        else if(b>a&&b>c)
        System.out.println(b);
        else if(c>b&&c>a)
        System.out.println(c);
        
    }
}
