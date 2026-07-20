import java.util.Scanner;
public class methods {
    static void sum(){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter 1st NUmber: ");
        int a=it.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=it.nextInt();
        System.out.println("Sum: "+(a+b));

    }
    static void greeting(){
        System.out.println("hello Sustian");
    }
    static int sum1(){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter 1st NUmber: ");
        int a=it.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=it.nextInt();
        return  (a+b);
    }
    public static void main(String[] args) {
//        System.out.println(sum1());
//        greeting();
//        String s=gret();
//        System.out.println(s);
//        String per=go("Zakaria");
//        System.out.println(per);
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        String name="Zakaria";
        changename(name);
        System.out.println(name);

        
        
        
        
        


    }

    private static void changename(String name) {
        name="losers";
    }

    private static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }

    private static String go(String name) {
        String message="Boy  "+name;
        return message;
    }

    static String gret(){
        String greet="How are u my boy?";
        return greet;
}

}
