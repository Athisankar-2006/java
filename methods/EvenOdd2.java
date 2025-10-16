public class EvenOdd2 {

     static boolean iseven(int n){
    return n%2==0;

    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(n+ " is "+  (iseven(n)? "Even":"odd"));
    }
    
}
