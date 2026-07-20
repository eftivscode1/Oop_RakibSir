import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        String a="Mango";
//        String b="Mango";
//        if (fruit.equals("Mango")) {
//            System.out.println("King of fruits");
//
//        }
//        if (fruit.equals("Apple")) {
//            System.out.println("Sweet Fruit");
//        }
//        if (fruit.equals("grape")) {
//            System.out.println("Small fruit");
//        }
//        switch (fruit) {
//
//            case "Mango":
//                System.out.println("King Of Fruits");
//                break;
//
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Grape":
//                System.out.println("A Small Fruit");
//                break;
//
//            default:
//                System.out.println("Invalid Input");
//        }

        int day=in.nextInt();
        switch(day){
            case 1,2,3,4,5-> System.out.println("Weekday");
            case 6,7-> System.out.println("Weekdays");
        }


    }

}