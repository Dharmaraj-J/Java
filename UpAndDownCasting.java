class D{
    public void show1(){
        System.out.println("in D show");
    }
}

class E extends D{
    public void show2(){
        System.out.println("in E show");
    }
}



public class UpAndDownCasting {
    public static void main(String[] args){

        D obj = new E();    //Upcating
        obj.show1();

        E obj1 = (E) obj;      //Downcasting
        obj1.show2();
    }
}
