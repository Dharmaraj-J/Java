public class Array {
    public static void main(String args[]){

        // Array
        int[] numbers = {123,543,34,4};
        numbers[0] = 2;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);


        // // Loop through the array
        String[] fruits = {"manago","apple","grapes","orange"};
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }


        //Loop through for each
        // for(String i : fruits){
        //     System.out.println(i);   
        // }

        // Multidimensional Array
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        myNumbers[1][0] = 77;
        System.out.println(myNumbers[1][0]);

        //Loop through Multidimensional Array
        for(int i = 0; i < myNumbers.length; ++i){
            for(int j=0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
         }
    }
}
