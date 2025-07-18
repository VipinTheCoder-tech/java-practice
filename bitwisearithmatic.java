public class bitwisearithmatic {
    public static void main(String[] args) {
        int a = 10; // 
        int b = 11; // 
        //bitwise operators.....
        //Bitwise AND
        int andResult = a & b; 
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; 
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notA = ~a; 
        int notB =~b;// Inverts bits of a
        System.out.println("Bitwise NOT of a: " + notA+notB);// dono int me 1, 1 + hoke minus lag jaega 
    }

}
