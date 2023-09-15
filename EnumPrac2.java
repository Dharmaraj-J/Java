enum Mobile{

    ASUS(9000),REDMI(10000),SAMSUNG(15000),VIVO(13000);  // It is a object.

    private int price;

    private Mobile(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }


}


public class EnumPrac2 {
    public static void main(String args[]){

        // Mobile mob = Mobile.ASUS;
        // System.out.println(mob + " : " + mob.getPrice());

        for(Mobile mob : Mobile.values()){
            System.out.println(mob + " : " + mob.getPrice());   
        }
    }
}   


        