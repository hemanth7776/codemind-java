import java.util.*;
public class CarChoice
{
    public static void main(String[] arga)
    {
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++)
        {
        int x1=read.nextInt();
        int x2=read.nextInt();
        int y1=read.nextInt();
        int y2=read.nextInt();
        double a=(double)y1/x1;
        double b=(double)y2/x2;
        // int b=y2/x2;
        if(a > b)
        System.out.println("1");
        else if(a < b)
        System.out.println("-1");
        else
        System.out.println("0");
        }
    }
}