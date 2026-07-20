import java.util.Scanner;
public class largest {
        public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
            System.out.print("Enter 1st number : ");
           int a=in.nextInt();
            System.out.print("Enter 2nd number : ");

            int b=in.nextInt();
            System.out.print("Enter 3rd number : ");

            int c=in.nextInt();
//           if(a>b&&a>c){
//               System.out.println(a);
//           }
//           else if(b>c){
//               System.out.println(b);
//           }
//           else{
//               System.out.println(c);
//           }
            int max=Math.max(Math.max(a,b),c);
            System.out.println(max);
 }

}
