import java.util.Scanner;

public class cwh_{
   public static void main(String[]args){
    int a,b,c;
    System.out.println("Enter the Marks of mathemeatics");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    System.out.println("Enter the Makrs of English ");
     b=sc.nextInt();
    System.out.println("Enter the marks of hindi ");
     c=sc.nextInt();
    double tm =300;
    int d=a+b+c;
     double p=(d/tm*100);
System.out.println("Your Percentage is :"+p+"%");
   }
}