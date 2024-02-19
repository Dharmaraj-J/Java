import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetPrac {
    public static void main(String[] args) {
        
        
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();  // It gives sorted values

        nums.add(23);
        nums.add(87);
        nums.add(45);
        nums.add(90);
        nums.add(23);    // Sets is unique

        for(int n: nums){
            System.out.println(n);
        }
    }
}
