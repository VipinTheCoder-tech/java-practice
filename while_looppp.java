import java.util.Scanner;

public class while_looppp {
    public static void main(String []args){

        int num;
    
        Scanner c=new Scanner(System.in);
    
        while (true){
System.out.println("Enter the number (negative to exit):");
num =c.nextInt();
if (num<=0){
    System.out.println("program is ended ");
    break; // exit the loop 

}
if (num%2==0){
    System.out.println("even Number");

}
else {
    System.out.println("odd number");

}
        }
        c.close();//close scanner
        
    }
}
