import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] merged=new int[arr1.length+arr2.length];
        int index=0;

        for(int i:arr1){
           merged[index++]=i;
        }
        for(int i:arr2){
           merged[index++]=i;
        }
        System.out.println("merged array:"+Arrays.toString(merged));
    }
    
}
