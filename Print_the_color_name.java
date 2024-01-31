import java.util.*;
public class Color
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        char x=read.next().charAt(0);
    
        if(x=='V')
        System.out.println("Violet");
        else if(x=='I')
        System.out.println("Indigo");
        else if(x=='B')
        System.out.println("Blue");
        else if(x=='G')
        System.out.println("Green");
        else if(x=='Y')
        System.out.println("Yellow");
        else if(x=='O')
        System.out.println("Orange");
        else if(x=='R')
        System.out.println("Red");
        else
        
        System.out.println("-1");
    }
}