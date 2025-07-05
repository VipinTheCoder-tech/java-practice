import java.util.Scanner;

public class while_looppi {
    public static void main(String[]args){
        int num;
        System.out.print("Enter any number");
        Scanner n=new Scanner(System.in);
        num=n.nextInt();
        while(num>=0)
{
        if(num%2==0){
          System.out.print("even Number");
          break;
        }
        else{
          System.out.print("odd number");
          break;

        }
}    System.out.print("while loop ended");
        
    }
}
