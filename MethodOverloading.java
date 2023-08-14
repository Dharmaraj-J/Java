public class MethodOverloading {

    public static int minusMethod(int x, int y){
        return x - y;
    }

    public static double minusMethod(double x, double y){
        return x - y;
    }

    public static void main(String args[]){

        int myNum1 = minusMethod(65,54);
        double myNum2 = minusMethod(78.90,47.89);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
