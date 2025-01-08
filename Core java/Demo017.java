import java.util.Scanner;

public class Demo017{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The entered number is: ");
        int num = sc.nextInt();
        int sum = 0;
        sum = (num/10) + (num%10);
        System.out.println("Sum of digits is: " + sum);
        sc.close();
        
        

    }
}