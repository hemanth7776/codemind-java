import java.util.*;
public class Grades
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int p=read.nextInt();
        int c=read.nextInt();
        int b=read.nextInt();
        int m=read.nextInt();
        int cs=read.nextInt();
        double totl=((p+c+b+m+cs)/500.0)*100.0;
        if(totl>=90)
        System.out.println("Grade A");
        else if(totl>=80)
        System.out.println("Grade B");
        else if(totl>=70)
        System.out.println("Grade C");
        else if(totl>=60)
        System.out.println("Grade D");
        else if(totl>=40)
        System.out.println("Grade E");
        else if(totl<40)
        System.out.println("Grade F");
    
        
    }
}