class Th1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi");
        }
    }
}

class Th2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hello");
        }
    }
}

public class ThreadPrac {
    public static void main(String[] args){

        Th1 obj1 = new Th1();
        Th2 obj2 = new Th2();

        obj1.start();
        obj2.start();

    }
}
