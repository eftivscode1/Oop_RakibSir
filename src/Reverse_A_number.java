
import java.util.Scanner;

public class Reverse_A_number {
    public static void  main(String[] args){
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int ans=0;
while(a!=0){
int rem=a%10;
    ans=ans*10+rem;
    a=a/10;
}
        System.out.println(ans);
    }
}
