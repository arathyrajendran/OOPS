import java.util.Scanner;public package java;
MatrixAdd
{
public static void main(String[]args)
{
    int p,q,m,n;
    Scanner S=new Scanner(System.in);
    System.out.println("Enter the number of rows in first matrix");
    p=S.nextInt();
    System.out.println("Enter the numbers of columns in first matrix");
    q=S.nextInt();
    System.out.println("Enter the number of rows in second matrix");
    m=S.nextInt();
    System.out.println("Enter the number of columns in second matrix");
    n=S.nextInt();
    if(p==m&&q==n)
    {
        int a[][]=new int [p][q];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("enter all the elements of first matrix:");
        for(int i=0;i<p;i++)
        for(int j=0;j<n;j++)
        a[i][j]=S.nextInt();
        System.out.println("First Matrix:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            System.out.println(a[i][j]+"");
            System.out.println(" ");
        }
        System.out.println("Second matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println.print(b[i][j]+"");

            }
            System.out.println("");
        }
        for(int i=0;i<p;i++)
        for(int j=0;j<n;j++)
        for(int k=0;k<q;k++)
        c[i][j]=a[i][j]+b[i][j];
        System.out.println("Matrix after addition:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(c[i][j]+"");
            System.out.println(" ");
        }                                                                                  
    }               
    else 
    {
        System.out.println("Addition would not be possible");
    }
}
}

