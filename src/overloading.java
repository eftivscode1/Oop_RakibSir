public class overloading {
    public static void main(String[] args) {
        fun(69); 
        fun("Zakaria");
    }
    static void fun(int a){
        System.out.println(a);
    }
   static void fun(String name){
       System.out.println(name);
    }
}
