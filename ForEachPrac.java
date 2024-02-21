import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPrac {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(65, 8, 23, 63, 21, 7);

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };

        nums.forEach(n -> System.out.println(n));
    }
}
