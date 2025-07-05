import java.util.Scanner;
public class boolean_logicc {
    public static void main(String[]args ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Are your baove 18?(true/false):");
        boolean isAdult=sc.nextBoolean();
        System.out.println("Do you have Driving license?(true/false):");
        boolean hasLicense=sc.nextBoolean();
        if(isAdult&&hasLicense){
System.out.println("Yes,You Can Drive ");
        }else{
            System.out.println("Sorry! ypu Can't Drive ");
        }
    }
}
