class Human{
    private int age;
    private String name;

    public String getName() {  // Getter
        return name; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  // Setter
        this.age = age; 
    }

    public void setName(String name) {
        this.name = name;
    }

    
}


public class Encap {
    public static void main(String args[]){
        Human obj1 = new Human();

        obj1.setAge(30);
        obj1.setName("Ram");
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }   
}
