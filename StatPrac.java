class Mobile{
    String brand;
    int price;
    static String name;   // static variable

    static{               // static block
        name = "SmartPhone";
    }

    public Mobile(){
        brand = " ";
        price = 0;
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj1){  // static method
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
    }
}



public class StatPrac {
    public static void main(String[] args){
       
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 4500; 


        Mobile obj2 = new Mobile();
        obj2.brand = "Asus";
        obj2.price = 3500; 


        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

        
    }
}
