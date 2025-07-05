import java.util.Scanner;

public class whilelooopreal {
   public static void main(String[]args){
    long num;
    System.out.println("input value ");
    Scanner s=new Scanner(System.in);
    num=s.nextLong();
    while(num%2==0){
        System.out.println("even number.Try again:");
        num=s.nextLong();

    }System.out.println("odd mumber .existing:");
   } 
}
