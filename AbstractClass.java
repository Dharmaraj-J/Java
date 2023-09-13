abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}


abstract class Bense extends Car{
    public void drive(){
        System.out.println("Drive..");
    }

}

class UpdatedBense extends Bense{
    public void fly(){
         System.out.println("Fly...");
    }
}


public class AbstractClass {
    public static void main(String[] args){
        Car obj = new UpdatedBense();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
