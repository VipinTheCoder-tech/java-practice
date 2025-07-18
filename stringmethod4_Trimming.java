public class stringmethod4_Trimming {
    public static void main(String[]args){

        String name="  vipin     ";
        System.out.println(name);
        String TrimmedSpaces=name.trim();
        System.out.println(TrimmedSpaces);

        //one more example of trim 

        String untrimmedspaces ="      vipi     ";
      System.out.println(untrimmedspaces);

        String trimmedString=untrimmedspaces.trim();

        System.out.println(trimmedString);    
    }
}
