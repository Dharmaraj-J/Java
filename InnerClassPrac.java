class Outer{
    int age;
    public void show(){
         System.out.println("in Show");
    }

    class Inner{
        public void config(){
            System.out.println("in Config");
    }
    }
}




public class InnerClassPrac{
    public static void main(String[] args){
        Outer obj = new Outer();

        obj.show();

        Outer.Inner obj1 = obj.new Inner();
       // Outer.Inner obj1 = new Outer.Inner();  the inner class is static use this syntax
        

        obj1.config();
        
    }
}