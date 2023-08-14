// public class Method {

//     public static void myMethod(){
//         System.out.println("myMethod is running");
//     }

//     public static void main (String[] args){
//         myMethod();
//     }
// }


// public class Method {

//     public static void myMethod(String fname, int age){  //parameter
//         System.out.println(fname + " is " + age);
//     }

//     public static void main (String[] args){
//         myMethod("Siva",20); // argument
//         myMethod("Arun",19);
//         myMethod("Ari",19);
//     }
// }


// method return a value
public class Method {

    public static int myMethod(int x, int y){ 
        return x + y;
    }

    public static void main (String[] args){
        int result = myMethod(23,20);
        System.out.println(result); 
    }
}