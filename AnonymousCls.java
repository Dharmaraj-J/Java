abstract class Q{
    
    public abstract void show();

}



public class AnonymousCls {
    public static void main(String[] args){
        
        Q obj = new Q(){
            public void show(){
                System.out.println("in new show");    //Anonymous class
            }
        };
        obj.show();

    }   
}















