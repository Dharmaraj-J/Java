public class StrBuff {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Ari");
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("karan");

        System.out.println(sb);

        String name = sb.toString();

        System.out.println(name);

    }
}
