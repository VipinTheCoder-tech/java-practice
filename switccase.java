import java.util.Scanner;

public class switccase {
    public static void main(String[]args){
        int Day ;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the day:");
        Day=input.nextInt();
        switch(Day){
            case 1:
            System.out.println("English");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
             case 6:
            System.out.println("Saturday");
            break;
             case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("sorry not listed");
        }
    }
}
