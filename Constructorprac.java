public class Constructorprac {
    int x;

    public Constructorprac(){  // default constructor
        x = 5;
    }

    public Constructorprac(int n){    // parameterized constructor
        x = n;
    }
    public static void main(String args[]){

        Constructorprac obj = new Constructorprac();
        Constructorprac obj1 = new Constructorprac(3);
        System.out.println(obj.x);
        System.out.println(obj1.x);

    }
}
