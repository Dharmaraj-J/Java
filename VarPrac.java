
public class VarPrac {

    // var price = 10 It gives an error.

    public static void main(String[] args) {

        int a = 10;
        var b = 20;
        var result = a + b;

        System.out.println(result);

        var nums = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        System.out.println(nums[1] + nums[3]);
    }
}
