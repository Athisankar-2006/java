public class RecursionFactorial {
    static int factorial(int num){
        if (num==0 || num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(" the factorial is "+factorial( n));
    }
    
}
