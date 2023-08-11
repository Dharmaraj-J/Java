public class WhileLoop {
    public static void main(String args[]){

        int i = 1;

        while(i<6){
            System.out.println("DAY"+i);

            int j = 1;

            while(j<=10){
               System.out.println(j+8);  
               j++;
            }
            i++;
        }


        // Do While
        // int k = 1;
        // do{
        //     System.out.println(k); 
        //     k++;
        // }while(k<10);
    }
}