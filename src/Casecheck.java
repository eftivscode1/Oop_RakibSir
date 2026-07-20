
import java.util.Scanner;

public class Casecheck {
    public static void  main(String[] args){
        Scanner in=new Scanner(System.in);
////        char ch=in.next().trim().charAt(0);
////        System.out.println(ch);
//        String a="Hello";
//        System.out.println(a.charAt(4));
char ch=in.next().trim().charAt(0);
if(ch>='a'&&ch<='z'){
    System.out.println("Lowerclass");
}
else{
    System.out.println("Upperclass");
}

    }
}
