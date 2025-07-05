import java.util.Scanner;

public class condition_if {
    public static void main(String[]args){

        int pwd;
        System.out.print("enter password: ");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==27838){
            System.out.println(" name vipin");
        } else{
            System.out.println("wrong password");
          }  }
}
