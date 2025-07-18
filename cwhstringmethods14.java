public class cwhstringmethods14 {
    public static void main(String[]args){

      //  int a =87;
        //float  b =47.9f;
       // System.out.format("the value of a is %d and the value of b is %f ",a,b);
//String Methods =1(name.length())2(name.toLowerCase())3(name.toUpperCase())4(nametrim())
       

String Nme ="ViPin";//we can use any variable name which we want 
          int value =  Nme.length();
          System.out.println(value);




//  one more example for this methods in different variable name 


String box="RECTANgle";
int size =box.length();
System.out.println(size);

//these are upper case methods nd lowercase methods

String lstring=box.toLowerCase();
System.out.println(lstring);

//lowercase metod 

String ustring=box.toUpperCase();
System.out.println(ustring );

//name.trim( method )
String name = "     vipin    ";
System.out.println("before trim ["  +name +  "]");

String trimmedName=name.trim();
System.out.println("after trim=["+trimmedName+"]");



    }
}
