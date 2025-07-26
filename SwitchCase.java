import java.util.Scanner;

public class SwitchCase {
    

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int date ;

      while(true){
        System.out.println("enter the dat of the month(1 to 30,0 to exit : ");
        date =sc.nextInt();

        if (date==0){
            System.out.println("Program ended ");
            break;
        }
        if (date <1||date>30){
         System.out.println("invalid date.Please enter a date from 1 to 30  ");
         
        } 
        int daynumber =(date -1)%7+1;// convert date to day of the week . this is an logic .
              
        switch (daynumber) {
         case 1:
            System.out.println("Monday");
         break ;
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
sc.close();
      }

   }



