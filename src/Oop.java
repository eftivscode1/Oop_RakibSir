import java.util.Scanner;

public class Oop {
    public static void main(String[] args){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter base: ");
        double base= it.nextDouble();
        System.out.print("Enter height: ");
        double height= it.nextDouble();
        double area=0.5*base*height;
        System.out.println("Area is: "+area+" Unit");


    }
}
