public class Array {
    public static void main(String args[]){

        // // Array
        // int[] numbers = {123,543,34,4};
        // numbers[0] = 2;
        // System.out.println(numbers[0]);
        // System.out.println(numbers.length);


        // // Loop through the array
        // String[] fruits = {"manago","apple","grapes","orange"};
        // for(int i = 0; i < fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }


        // //Loop through for each
        // // for(String i : fruits){
        // //     System.out.println(i);   
        // // }

        
        // int[] nums = new int[4];
        // nums[0] = 12;
        // nums[1] = 23;
        // nums[2] = 3;
        // nums[3] = 34;
        // for(int i = 0; i < 4; i++){
        //     System.out.println(nums[i]);
        // }


        // // Multidimensional Array

        // int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        // myNumbers[1][0] = 77;
        // System.out.println(myNumbers[1][0]);

        // //Loop through Multidimensional Array
        // for(int i = 0; i < myNumbers.length; ++i){
        //     for(int j=0; j < myNumbers[i].length; j++){
        //         System.out.println(myNumbers[i][j]);
        //     }
        //  }

        int[][] nums = new int[3][4];
        

        for (int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                nums[i][j] =(int) (Math.random() * 100);
            }
        }

        for (int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // for each method
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        //jagged array  
        int[][] nums2 = new int[3][];
        nums2[0] = new int[3];
        nums2[1] = new int[4];
        nums2[2] = new int[2];

        
        for (int i=0; i<nums2.length; i++){
            for(int j=0;j<nums2[i].length;j++){
                nums2[i][j] =(int) (Math.random() * 100);
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
