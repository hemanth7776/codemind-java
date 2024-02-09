
    
import java.util.*;
public class Matrix
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int r=read.nextInt();
        int c=read.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]+=read.nextInt();
            }
        }
        
        int r1=read.nextInt();
        int c1=read.nextInt();
        int matrix2[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix[i][j]+=read.nextInt();
            }
        }
        int x[][]=new int[r1][c1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c1;j++){
                for(int k=0;k<c;k++){
                 x[i][j]=matrix[i][j]+matrix2[i][j];
                
                }
                
                
            }
            
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
