import java.util.Scanner;

public class while_looppp {
    public static void main(String []args){

        int num;
        System.out.println("enter the number here ");
        Scanner c=new Scanner(System.in);
        num=c.nextInt();
        while(num>=0){
            if(num%2==0){
          System.out.println("even number");
            
            }
            else{
                System.out.println("odd number");
            

            }
            System.out.println("ended");
            break;

        }
    }
}
