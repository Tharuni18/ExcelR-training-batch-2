public class Demo003{
    public static void main(String[] args){
        
        int a=50;
        int b=40;
        int c=30;
        if(a>b && a>c){
            System.out.println(a + " is the largest number");

        } else if(b>a && b>c){
            System.out.println(b + " b is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }
    }
}