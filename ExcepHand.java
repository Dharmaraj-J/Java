public class ExcepHand {
    public static void main(String[] args){

        int n = 0;
        int m = 0;

        try{
            m = 24/n;
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }

        System.out.println(m);
        System.out.println("Bye");
    }
}
