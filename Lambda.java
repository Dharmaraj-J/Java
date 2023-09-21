@FunctionalInterface     //Annotation
interface A{
    void show();
}

interface B{
    int add(int i,int j);
}

public class Lambda {

    public static void main (String[] args){

        // A obj = new A()
        // {
        //     public void show(){
        //         System.out.println("in A show");
        //     }
        // };

        A obj = () -> System.out.println("in A show");   //Lambda Expression
        obj.show();

        B obj1 = (i,j) -> i+j;    // Lambda Expression with return type

        System.out.println(obj1.add(45,5));
        
    }
}