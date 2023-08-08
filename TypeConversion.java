public class TypeConversion {
    public static void main(String args[]) {

        // Widening Casting
        // Widening casting is done automatically when passing a smaller size type to a larger size type

        int num = 45;
        double d = num;

        System.out.println(num);
        System.out.println(d);

        // Narrowing Casting
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value

        double num1 = 988;
        int b = (int) num1;

        System.out.println(num1);
        System.out.println(b);
 
        
   }
}
