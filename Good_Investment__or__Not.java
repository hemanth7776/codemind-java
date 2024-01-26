import java.util.*;
public class Investment
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        int c=y*2;
        if(x>=c)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}