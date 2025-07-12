import java.util.Scanner;

public class cwh_exercise{
      public static void main(String[]args){
    int a,b,c;
    System.out.println("Enter the Marks of mathemeatics");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    System.out.println("Enter the Makrs of English ");
     b=sc.nextInt();
    System.out.println("Enter the marks of hindi ");
     c=sc.nextInt();
    float tm =300;
    float d=a+b+c;
     float p=(d/tm*100 );
System.out.println("Your Percentage is :"+p+"%");
   }
}