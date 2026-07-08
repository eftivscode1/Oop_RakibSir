import java.util.Scanner;

public class Circle {
    public static void  main(String[] args){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r=it.nextInt();
        double area=3.1416*r*r;
        System.out.println("Area of the Circle: "+area+" sq");

    }
}
