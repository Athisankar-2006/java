public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={3,4,5,12,34,56,32,8};

        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    System.out.println(i+ " ");
                }
            }
        }
    }
    
}
