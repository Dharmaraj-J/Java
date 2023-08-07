class DataType {
    public static void main(String args[])
    {   
        //primitive Datatype
        //Integer
        int num1 = 45;    //4 bytes  Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long num2 = 890;  //8 bytes  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        short num3 = 3;   //2 bytes  Stores whole numbers from -32,768 to 32,767
        byte num4 = 12;   //1 byte   Stores whole numbers from -128 to 127

        //Float
        float num5 = 4.54f; //4 bytes  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double num6 = 23.7; //8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits

        //char
        char myGrade = 65;    //2 bytes  Stores a single character/letter or ASCII values

        //Boolean
        boolean b = false; //1 bit


        //Non-premitive Datatype
        //String
        String s = "hi";


        System.out.println(myGrade);

    }
}