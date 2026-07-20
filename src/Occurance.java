
import java.util.Scanner;

public class Occurance {
    public static void  main(String[] args){
Scanner n=new Scanner(System.in);
int a=n.nextInt();
int b=n.nextInt();
int c=a;
int count=0;
while(c!=0){
    int temp=c%10;
    if(temp==b){
        count++;
    }
    c=c/10;
}
        System.out.println(count);
    }
}
