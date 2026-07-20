import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();
        switch (empid) {
            case 1:
                System.out.println("Zakaria");
                break;

        case 2:
        System.out.println("Rahul ");
        break;
            case 3:
                System.out.println("Employee 3");
                switch (department){
                    case "IT":
                        System.out.println("It dept");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No dept entered");

                }
            default:
                System.out.println("Enter Correct Emplay id");
    }
    }
}
