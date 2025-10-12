public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12,54,75,65,87,43,85};
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>first){
                
                second=first;
                first=a;

            }
            else if(a>second && a!=first){
                second=a;
            }
        }
        System.out.println("second largest :"+second);
    }
    
}
