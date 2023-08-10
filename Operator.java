public class Operator{
    public static void main(String args[]){
        
        int a = 7;
        int b = 23;
        int c = 8;
        boolean x = true;
        boolean y = false;

        // Arithmetic operator
        // +,-,*,/,%

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Assignment operator
        // =,+=,-=,*=,/=,%=,&=,|=,^=,<<=,>>=

        System.out.println(a += 5);
        System.out.println(a -= 5);
        System.out.println(a *= 5);
        System.out.println(a /= 5);
        System.out.println(a %= 5);
        System.out.println(a &= 7);
        System.out.println(a |= 5);
        System.out.println(a ^= 6);
        System.out.println(a <<= 1);
        System.out.println(a >>= 2);

        // Relational Operator
        // ==,>,<,>=,<=,!=

        System.out.println(a == 5);
        System.out.println(a < 5);
        System.out.println(a > 5);
        System.out.println(a >= 5);
        System.out.println(a <= 5);
        System.out.println(a != 5);

        // Logical Operator
        // &&,||,!

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // Bitwise Operator 
        // // &,|,^,<<,>>,~

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << b);
        System.out.println(a >> b);
        System.out.println(~a);

        //Unary Operator
        // +,-

        System.out.println(+b);
        System.out.println(-b);

        // Trenary Operator
        // condition ? true : false

        int result = a>b ? a>c ?a:c:b>c ? b:c ;
        System.out.println(result);


        // Increament and decreament Opeartor 
        // ++,--

        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);
    

    }
}