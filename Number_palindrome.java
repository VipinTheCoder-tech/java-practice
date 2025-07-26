public class Number_palindrome {
  public static void main(String[] args) {
     int num = 121;
     int vip=num ;
     int reversed =0;

     while(vip!=0){
        int Lastdigit=vip %10;
        reversed = reversed * 10 + Lastdigit;
        vip=vip /10;
        

     }
     if (num==reversed ){
     System.out.println(num+"is a palindrome.");}
     else{
        System.out.println(num+"is not a palindrom.");
     }
     
     }
  }  

