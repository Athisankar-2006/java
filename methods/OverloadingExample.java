public class OverloadingExample {

    static int add(int a, int b){
        return a+b;
    }
      static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(3.5 ,5.8));
    }
    
}
