import java.util.Scanner;

public class Pos {
        public static  void main(String[] args) {
            Scanner it=new Scanner(System.in);
            System.out.print("Enter thr number: ");
            int a=it.nextInt();
            if(a>0) System.out.println("Positive Integer");
            else if(a==0) System.out.println("Zero");
            else System.out.println("Negative Integer");


        }
    }


