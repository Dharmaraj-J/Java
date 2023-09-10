class X{
    public void display(){
        System.out.println("in X show");
    }
}

class Y extends X{
    public void display(){
        System.out.println("in Y show");
    }
}

class Z extends X{
    public void display(){
        System.out.println("in Z show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
            X obj = new X();
            obj.display();

            obj = new Y();
            obj.display();
            
            obj = new Z();
            obj.display();
    }

}
