import java.until.Arrays;import
java.until.Scanner;public class
StringSort
{
    public static void main(String[]args)
    {
        int count=0;String tmp;
        Scanner scan=new Scanner(System.in);
        System.outprintln("enter~number~of~strings~to~sort:");
        count=scan.nextInt();
        String str_list[]=new String[count];Scanner 
        scan1=new Scanner(System.in);
        System.out.println("enter~your~strings:");
        for(int i=0;i<count;i++)
        str_list[i]=scan1.nextI.ine();
        System.out.println("choose~1~or~2~feom~the`menu~below");
        System.out.println("1:~inbuilt~sort()");
        System.out.println("2:~user~defined~sorting~logic()");
        int choice;choice=scan.nextInt();
        switch(choice)
        {
            case 1:Arrays.sort(str_list);
            System.out.println(Arrays.toString(str_list));
            break;
            case 2:for(int i=0;i<count-1;i++)
            if(str_list[i].compareTo(str_list[j])>0)
            {
                tmp=str_list[i];
                str_list[i]=str_list[j];
                str_list[j]=temp;
            }
            System.out.println(Arrays.toString(str_list));
            break;
        }
    }
}
