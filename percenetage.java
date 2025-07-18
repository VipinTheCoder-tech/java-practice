import java .util.Scanner;
public class percenetage {
    

    public static void main(String[]args){
        int a ,b,c,d,e;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Mathemetics:");
        
        a =sc.nextInt();
           System.out.println("enter marks of hindi");

         b=sc.nextInt();
          System.out.println("enter marks of english");
          c=sc.nextInt();
          System.out.println("enter marks of science ");
           d=sc.nextInt();
        System.out.println("enter marks of computer ");
          e=sc.nextInt();
int Total =500;
float Marks =a+b+c+d+e;
float percentage=Marks/Total*100;
System.out.println(percentage);
    }     
}


