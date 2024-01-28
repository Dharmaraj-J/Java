public class ExcepHand {
    public static void main(String[] args){

        int n = 2;
        int m = 0;

        int[] nums = new int[5];
        String str = null;

        try{
            m = 24/n;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }

        catch(Exception e){   //parent class of all Exception
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(m);
        System.out.println("Bye");
    }
}
