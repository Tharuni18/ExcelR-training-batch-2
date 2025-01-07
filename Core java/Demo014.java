public class Demo014{
    public static void main(String[] args) {
        int a = 3;
        int u1 = a++;
        System.out.println("Unary add1: " + u1);
        int u2 = ++a;
        System.out.println("Unary add2: " + u2);
        int u3 = a--;
        System.out.println("Unary sub1: " + u3);
        int u4 = --a;
        System.out.println("Unary sub2: " + u4);

    }
}