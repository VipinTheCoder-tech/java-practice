import java.util.Scanner;

public class chw_18_elseif {
    public static void main(String[] args) {
       int age;
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the age here: ");
       
       age=sc.nextInt();
       
      if (age>56){
        System.out.println("you are experienced ");
       } 
        else if (age>=46){ // if we didn't use else then it will print all the line at a one time like experienced ,semi experience ,semi-semi  and all

        System.out.println("you are semi experinced ");
       }

      else   if (age>36){
        System.out.println("you are semi-semi experieinced ");
       }
       else{System.out.println("you are not experinced ");

       }
    

    }
}
