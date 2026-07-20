import java.util.Scanner;

public class sum {
public  static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    float num1=input.nextFloat();
    System.out.print("Enter 2nd number : ");
    float num2=input.nextFloat();
    float sum=num1+num2;
    System.out.println("Sum is = "+sum);
}
}
