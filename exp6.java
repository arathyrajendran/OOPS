
import java.util.Scanner;
public class shapearea
{
    void calculatearea(float a)
    {
        System.out.println("\n Area of the square="+a*a);
    }
    void calculatearea(int l,int b)
    {
        System.out.println("\n Area of the rectangle="+1*b);
    }
    void calculatearea(double r)
    {
        double area=3.14*r*r;
        System.out.println("\n Area of the circle="+area);
    }
    public static void main(String[]args)
    {
        shapearea obj=new shapearea();
        System.out.println("\n\n ENTER SIDE OF SQUARE\n");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        obj.calculatearea(side); 
        System.out.println("\n\n ENTER RADIUS\n");
        Scanner sc1=new Scaner(System.in);
        double rad=sc.nextDouble();
        obj.calculatearea(rad);
        System.out.println("\n\n ENTER SIDE OF RECTANGLE\n");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        obj.calculatearea(side1,side2);
    }
}
