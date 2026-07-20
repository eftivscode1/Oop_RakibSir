import java.util.Scanner;
public class Main{
     public static void main() {
         Scanner input=new Scanner(System.in);
         int n= input.nextInt();
         int count=2;
         int a=0;
         int b=1;
         while(count<=n){
             int temp=b;
             b=b+a;
             a=temp;
             count++;
         }
         System.out.println(b);

    }
}