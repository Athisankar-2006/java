
import java.util.Arrays;

public class MinMaxArray {

    static int[] minmax(int[] arr){
        int min=arr[0],max=arr[0];
        for(int n:arr){
            if(n>max) max=n;
            if(n<min) min=n;
        }
        return new int[] {min ,max};
    }
    public static void main(String[] args) {
        int[] n={1,4,5,6,78,98};
        int[] result=minmax(n);
        System.out.println("minimum and max is " +Arrays.toString(result));
    }
    
}
