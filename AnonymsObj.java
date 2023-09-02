class D{

    public D(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("in A show");
    }
}



public class AnonymsObj {
    public static void main(String[] args){
 
        new D().show();    //Anonymous Object
        new D().show();  
    }   
}
