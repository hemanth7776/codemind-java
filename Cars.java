import java.util.*;
public class Cars
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n1=read.nextInt();
        int n2=read.nextInt();
        int x=read.nextInt();
        if(n1>n2)
        System.out.println(-1);
        else
        {int c=1;
            while(x+n1>=n2)
            {
                c++;
                n1=n1+n1;
                n2=n2+n2;
            }
            System.out.println(c);
        }
        
    }
}