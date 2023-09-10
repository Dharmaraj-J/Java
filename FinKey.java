final class Animal{     //cannot inherit the class

    final public void eat(){  //cannot override the method
        System.out.println("I am eating");
    } 
}


// class SmallAnimal extends Animal{   //   It shows error
//     public void eat(){ 
//         System.out.println("I am also eating");
//     } 
// }




public class FinKey {
    public static void main(String[] args){
       final double PI = 3.14;
       // PI = 3.32  Cannot change the variable
       System.out.println(PI);
       Animal obj = new Animal(); 
       obj.eat();;
    }
}
