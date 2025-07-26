public class pallindrom_basic {
   public static void  main(String[]args){
    // convert the strng to lower case (to ensure case-insensistivity)
    //so that first we make a String 
    String name ="Level";
    String lowername=name.toLowerCase();//to ensure case insensitivity 
       
       int start =0,end =lowername.length()-1;
       while(start<end){
        if (lowername.charAt(start)!=name.charAt(end)){
            System.out.println("false");
        }
        start++;
        end --;
       }if (is pallindrome){
        System.out.println(name +"")
       }
    
       System.out.println("true");// all pairs matched so it is pallindrome 

   } 
   
}
