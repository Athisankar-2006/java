public class sumAVG {
    public static void main(String[] args) {
        int[] arr={12,2,134,53,12,5};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        double avg=(double) sum/arr.length;
        System.out.println("sum :"+sum+ " average :"+avg);
    }
    
}
