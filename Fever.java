import java.util.*;
public class Fever
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        if(x>98)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}