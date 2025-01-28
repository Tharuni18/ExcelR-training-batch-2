public class Demo054 {
    int add(int a, int b) {
        return a + b;
    } 
    double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        int result1 = obj.add(5,10);
        System.out.println("Sum of two integers: " + result1);
        double result2 = obj.add(3.5, 2.5, 1.0);
        System.out.println("Sum of three doubles: " + result2);
    }
}

