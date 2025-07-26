import java.util.Scanner;

public class ch_4_practiceset_cwh_19 {
    //Qusetion 1 of cwh 19 practice set 
    
    public static void main(String[] args) {
        /* 
        int a ;
        System.out.println("enter your age ");
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();
        if( a== 11){
            System.out.println("i m 11 year old ");
            
        }else {
            System.out.println("sorry");
        }
        */
      
      
      
      
      
     //question 2 write a program to find out  whther a student is pass or fail : 
       // if it requires total 40% and at least 33% in each subject to pass assume 3 subject and take marks a an input from the user 

      
       
       
       int  M1 ,M2,M3;
        



         Scanner sc =new Scanner (System.in);
 System.out.println("enter the marks IN PHYSICS  ");
         M1=sc .nextInt();
System.out.println("enter the marks IN MATHEMATICS   ");
         M2 = sc.nextInt();
System.out.println("enter the marks IN CHEMISTRY  ");
         M3= sc.nextInt ();
         
       float avg =M1+M2+M3/3.0f;//  if we divide integer by integer then result is integer so that we divding with float so the result wil be float 
      if (avg>=40 && M1>=33 && M2>=33  &&  M3>=33 ){
System.out.println(" congratulations , you have been promoted ");

      } 
      
      
      else{
        System.out.println("sorry! you have been failed  ");
      }
        
        System.out.println(" physics-"+M1   + "  " +  "mathematics-"+M2  +  "    "  +  "chemistry-"+M3);

     //  Question 3 ?
       }

        
    }

