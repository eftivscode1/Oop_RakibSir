import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter thr number: ");
        int p = in.nextInt();
//        for(int i=1;i<=p;i++){
//            System.out.print(i+" ");
//        }
//        int i=1;
//        while(i<=p){
//            System.out.print(i+" ");
//            i++;
//        }
//    }
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= p);
    }
}
