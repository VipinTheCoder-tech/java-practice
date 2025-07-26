public class string_length {
    public static void main(String[]args){
        String name ="VIPIN";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        vipin.sayHello();  // static method 
    }}
    class vipin {
        static   void sayHello(){
            int a = 55;
            int b=45;
            System.out.println(a+b);

             more obj =new more();// this is not static where we makes an object that is not static method 
    obj.sayHello();
        }
    }
   
class more {
  void sayHello(){
    int a=33;
    int b=22;
    System.out.println(a+b);
    
    vinod.sayHello();

}
}
class vinod  {
     static  void sayHello(){
     int a=22;
    int b =228;
    System.out.println(a+b);

    indexes obj =new indexes();//non static 
    obj.sayHello();

    }
    
}
class indexes{
     void sayHello(){
        int a=22;
        int b =33;
        System.out.println(a+b);
        stud obj =new stud();
        obj.main();
    }
}
class stud {
    static  void main(){// optional sttaic can be use or not because it is not static because we maked an object before 
        String str ="vipin";
        System.out.println(str.charAt(0));
        unknown.main();
    }
}
class unknown{
    static  void main(){   // this is static methhod without static we get errors because object we maked before in it 
        System.out.println("hello");
    }
}