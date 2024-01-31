import java.util.*;
public class Vowel
{
    public static void main(String[] args)
    {
        Scanner read =new Scanner(System.in);
        char x=read.next().charAt(0);
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
        System.out.print("Vowel");
        else if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
        System.out.print("Vowel");
        else 
        System.out.print("Consonant");
    }
}