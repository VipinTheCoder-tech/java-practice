import java.util.Scanner;
public class integgornott {
    

    public static void main(String[]args ){
    float b;

    
      System.out.println("Enter float vALUE ..");
        
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextFloat()){
            b=sc.nextFloat();
            System.out.println("integers ");
        }
         
         else{
            System.out.println("sorry these are  not a integers");
         }
            
          //  sc.hasNextFloat();
             
         
       
        
        
    }
}


