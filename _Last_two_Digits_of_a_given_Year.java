import java.util.*;
public class Year
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        // int digit=0,year=0;
       int year=x%100;
        System.out.printf("%02d",year);
    }
}