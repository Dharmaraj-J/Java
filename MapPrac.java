import java.util.HashMap;
import java.util.Map;

public class MapPrac {
    public static void main(String[] args) {
        
        Map<String,Integer> students = new HashMap<>();

        students.put("Navain",56);
        students.put("Arun",23);
        students.put("Ari",19);
        students.put("Murugan",19);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            
            System.out.println(key + " : " + students.get(key));
        }
       
        

    }
}
