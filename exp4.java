package java;
import java.util.Scanner;
public class symmetricmatri
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the no of rows");
   int rows=sc.nextInt();
   System.out.println("enter the no of columns");
   int cols=sc.nextInt();
   int matrix[][]=new int [rows][cols];
   System.out.println("enter the element");
   for(int i=0;i<rows;i++)
   for(int j=0;j<cols;j++)
   matrix[i][j]=sc.nextInt();sc.close();
   System.out.println("printing input matrix");
   for(int i=0;i<rows;i++)
   {
      for(int j=0;j<cols;j++)
      System.out.print(matrix[i][j]+ "\t");
      System.out.println();
   }
   if(rows!=cols)
   Syatem.out.println("The given matrix is not a square matrix:");
   else;
   boolean symmetric=true;for(int i=0;
   i<rows;i++)for(int j=0;j<cols;j++)
   if(matrix[i][j]!=matrix[j][i])
   {
      symmetric=faLse;
      break;
   }
   if(symmetric)
   {
      System.out.println("the given matrix is symmetric..................");
   }
   else
   {
      System.out.println("the given matrix is not symmetric.................");
   }
   }
   }
}
