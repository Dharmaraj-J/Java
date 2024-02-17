import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionPrac {
    public static void main(String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer>();

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(9);
        nums.add(6);
        nums.add(10);
        nums.add(12);

        System.out.println(nums.indexOf(12));

        System.out.println(nums.get(2));


        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}
