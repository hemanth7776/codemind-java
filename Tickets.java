import java.util.*;
public class Ticket
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        if((4*x)<=1000)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}