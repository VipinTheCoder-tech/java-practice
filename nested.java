import java.util.Scanner;

public class nested {
    public static void main(String[]args){
        int result;
        System.out.println("Enter THE marks here ");
        Scanner box=new Scanner(System.in);
        result=box.nextInt();
        if(  result>150)
        {
         System.out.println("Superb");

        }else{
            if(result>100){
         System.out.println("Second Divison");

            }else{
                if(result<50){
               System.out.println("Failed");
                }else{
                    System.out.println("Passed but third division ");
                }
                System.out.println("Try Next Time ");
            }
        }

    }
}
