import java.util.Scanner;

   public class frluup {
   public static void main(String[]args){
  

    int num;
    System.out.print("Enter number : ");
    Scanner s =new Scanner(System.in);
    num=s.nextInt();
    for( int i=1; i<=10;i++){
    System.out.println(num+"*"+i+"="+i*num);
    }
   } 
}
//for( int i=1; i<=10;i++){
//System.out.println(num + " x " + i + " = " + (num * i));