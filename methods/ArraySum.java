public class ArraySum {

    static int sum(int[] num){
        int sum=0;
        for(int m:num){
            sum+=m;
            
        }return sum;
    }

    
    public static void main(String[] args) {
        int[] n={1,2,3,4,6,7};
        System.out.println(sum(n));
    }
    
}
