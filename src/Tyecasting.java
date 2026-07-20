import java.util.Scanner;

public class Tyecasting {
    static void main() {
//        Scanner input=new Scanner(System.in);
//        float num= input.nextFloat();
//        System.out.println(num);
//
//        int num=(float)90.67;
//        System.out.println(num);
////        int a=257;
//        byte a=40;
//        byte b=50;
//        byte c=100;
//    int d=(a*b)/c;
//        System.out.println(d);
//byte b=50;
//b=b*2;
//int num='A';
//        System.out.println(5*6.965664f);
        byte b=42;
        char c='a';
        short s=1024;
        float f=5.67f;
        double d=0.1234;
        int i=50000;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
