class R{

    public void show(){
        System.out.println("in R show ");
    }

    public void config() {
         System.out.println("in Config ");
    }
}

class S extends R{

    public void show() {
        System.out.println("in S show");
    }

}


public class MethodOverRiding {
    public static void main(String[] args){
        S obj = new S();
        obj.show();
        obj.config();
    }
}
