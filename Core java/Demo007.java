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
        Long phoneNo = sc.nextLong();
        System.out.println("My phoneno is:" + phoneNo);
        System.out.println("Hello " + name +" your age is " + age + " and your phoneNumber is 18" + phoneNo);
        sc.close();

        
    }
}