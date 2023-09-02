class Calculator{
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int sub(int n1,int n2){
        return n1 - n2;
    }
}

class AdvanCal extends Calculator{
    public int mul(int n1,int n2){
        return n1 * n2;
    }
    public int div(int n1,int n2){
        return n1 / n2;
    }
}

class VeryAdvanCal extends AdvanCal{
    public double power(int n1,int n2){
        double value = Math.pow(n1, n2);
        return value;
    }
}


public class SinMulInher {
    public static void main(String[] args){
        VeryAdvanCal obj = new VeryAdvanCal();
        System.out.println(obj.add(86,85));
        System.out.println(obj.sub(82,2));
        System.out.println(obj.mul(6,5));
        System.out.println(obj.div(23,5));
        System.out.println(obj.power(2,5));
        
    }
}
