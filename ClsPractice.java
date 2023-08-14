class Calculator{
    public int add(int x, int y){
        return x+y;
    }
}


public class ClsPractice {
    public static void main(String args[]){

        int num1 = 10;
        int num2 = 40;

        Calculator obj1 = new Calculator();
        int result = obj1.add(num1,num2);
        System.out.println(result);
    }
}