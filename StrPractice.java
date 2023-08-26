public class StrPractice {
    public static void main(String args[]){

        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());  //Find the length of the string
        System.out.println(txt.toLowerCase()); //Convert lowercase
        System.out.println(txt.toUpperCase()); //convert uppercase
        System.out.println(txt.indexOf("Y")); //index (the position) of the first occurrence of a specified text in a string

        // String Concatenation
        String firstName = "Siva";
        String lastName = "kumar";
        System.out.println(firstName+lastName);
        System.out.println(firstName.concat(lastName));

        String x ="10";
        int y = 20;
        System.out.println(y+x);    

        // Another method
        String name = new String("Ram");
        name = name + "Kumar";
        System.out.println(name);

        String name1 = "Hari";
        String name2 = "Hari";

        System.out.println(name1 == name2);

    }   
}