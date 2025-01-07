public class Demo015{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping a is: " + a);
        System.out.println("Before Swapping b is: " + b);
        int x = a;
         a = b;
         b = x;
        System.out.println("After Swapping a is: " + a);
        System.out.println("After Swapping b is: "+ b);
    }
}