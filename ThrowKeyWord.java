public class ThrowKeyWord {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("I don't want to print zero");    // Throw keyword is used to throw the exception
            }
        }

        catch(ArithmeticException e){
            j = 18/1;                                              // Handling the exception
            System.out.println("thats the default output " + e);
        }
       
        catch(Exception e){
            System.out.println("Something went wrong...." + e);
        }

        System.out.println(j);

        System.out.println("Bye");
        
        
    }
}
