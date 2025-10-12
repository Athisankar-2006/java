public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,2,2,4,7,7,4};
        
        for (int i=0;i<arr.length;i++){
            int count=1;
            if (arr[i]==-1) continue;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
         
    }
}
