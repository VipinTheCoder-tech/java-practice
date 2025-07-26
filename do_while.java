import java.util.Scanner;

public class do_while {
        public static void main(String[]args){
        int num;
        System.out.print("enter here ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        do{
            System.out.println(num);
            ++num;
        }
        while (num<=100);// if we put number b/w 150 it will print upto 150 
        //if we put above 150 it will execute do only not while
    }
}
