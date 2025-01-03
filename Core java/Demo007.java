import java.util.Scanner;

public class Demo007{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is:" + name);
        System.out.print("Enter your age");
        int age = sc.nextInt();
        System.out.println("My age is:" + age);
        System.out.println("Enter your phoneno");
        String phoneNo = sc.nextLine();
        System.out.println("My phoneno is:" + phoneNo);
        sc.close();

        
    }
}