interface A{


    int age = 44;
    String area = "Namakkal"; //Interface attributes are by default public, static and final


    void show();
    void config();           //Interface methods are by default abstract and public
}


class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
         System.out.println("in config");
    } 
}


public class InterfacePrac2 {
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.config();
        obj.show();

        // A.age = 23;  It gives an error beacuse final attribute cannot be changed
        System.out.println(A.age);
        System.out.println(A.area);
    }
}
