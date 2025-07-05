import java.util.Scanner;

class dowhilelooop{
    public static void main(String[]args){
        int num;
        System.out.print("enter here ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        do{
            System.out.print("hello m okay to strt");
        }
        while(num<0);
    }
}