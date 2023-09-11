class Laptop{
    String model;
    int price;


    public boolean equals(Laptop that){
        return this.model == that.model && this.price == that.price;
    }


    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


}


public class ObjClass {
    public static void main(String[] args){
        Laptop obj = new Laptop();
        obj.model = "Asus";
        obj.price = 50000;

        Laptop obj1 = new Laptop();
        obj1.model = "Asus";
        obj1.price = 50000;

        boolean result = obj.equals(obj1);
        System.out.println(result);
    }
}
