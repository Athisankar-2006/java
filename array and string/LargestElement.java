public class LargestElement {
    public static void main(String[] args) {
        int[] arr={12,43,21,65,75,23};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element is "+max);
    }
    
}
