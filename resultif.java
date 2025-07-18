import java.util.Scanner;
public class resultif {
    public static void main(String[]args){
        int marks;
        System.out.println("Enter marks");
        Scanner obj =new Scanner(System.in);
        marks=obj.nextInt();

        if (marks>150 && marks<=200)
        {
            System.out.println("Brilliant");

        }
        else if(marks>70 && marks<=100)
        {
          System.out.println("second division");
        }
         else if(marks>33&&marks<=50)
        {
            System.out.println("thired division");

        }
        else{
            System.out.println("Failed " );
            System.out.println("Sorry!Try Next Time ");
        }
        
    }
}
