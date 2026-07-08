import java.util.Scanner;

public class temp {
    public static void main(String[] args){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Temp: ");

        double c=it.nextDouble();
        double fahrenhite=((9*c)/5)+32;
        System.out.print("Temp in farenhite: "+fahrenhite);

    }
}
