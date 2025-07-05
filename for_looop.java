import java.util.Scanner;
public class for_looop {

public static void main(String[]args){
int num;
System.out.println("Enter the Table Which You Want to See:");
Scanner obj=new Scanner(System.in);
num=obj.nextInt();
for(   int i=1; i<=10;i++){
System.out.println(num+"*"+i+"="+i*num);
}

}
}
// System.out.println(num+"*"+i+"="+i*num);