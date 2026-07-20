import java.util.Arrays;

public class ChangeName
{
    static int x=90;
    public static void main(String[] args) {
//        int[] arr={1,2,3};
////        int s=10;
////        {
////            s=0;
////        }
////        System.out.println(s);
//change(arr);
//        System.out.print(Arrays.toString(arr));
        System.out.println(x);
        int x=50;
        System.out.println(x);//Shadowing

        fun();

    }
    static void change(int[] nums){
nums[0]=99;
}
static void fun(){
    System.out.println(x);
}
}
