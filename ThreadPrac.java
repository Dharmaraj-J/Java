class Th1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}

class Th2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrac {
    public static void main(String[] args){

        Th1 obj1 = new Th1();
        Th2 obj2 = new Th2();

        // System.out.println(obj1.getPriority());  used to get the prority of thread

        // obj1.setPriority(7);    used to set the priority to thread(1 to 10)

        obj1.start();
        obj2.start();

    }
}
