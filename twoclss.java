import java.util.Scanner;

import javax.swing.undo.UndoManager;

public class twoclss {
    public static void main(String[]args){
System.out.println("Hey! How are You");
   
 easy e=new easy();
 e.display();
}
}
class easy{
    void display(){
        System.out.println("Second: Class In SIngle Extension");
        allinone a=new allinone();
        a.display();

    }
}
class allinone{
    void display(){
        int a,b,c ,e;
        System.out.println("Enter The Key Here ");
        Scanner s=new Scanner(System.in);
        boolean d=true;
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("your name ");
        
     if(a==100&& b==838  ) 
     {
        System.out.println("Nice");}
     }
}

