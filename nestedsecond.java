import java.util.Scanner;
public class nestedsecond {
    public static void main(String[]args)
{
    int num1,num2,num3;
    System.out.println("enter any Random Value in it ");
    Scanner obj=new Scanner(System.in);
    num1=obj.nextInt();
    num2=obj.nextInt();
    num3=obj.nextInt();
    if(num1>num2)
    {

        if(num1>num3)
        {
System.out.println("Maximum number"+num1);                  
        }
        else{
System.out.println("Maximum number"+num3);

        }
        

    }
    else{
        if(num2>num3)
        {
System.out.println("Maximum number"+num2);
        }
        else{
System.out.println("Maximum number"+num3);
        }
    }

}}