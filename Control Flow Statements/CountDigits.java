public class CountDigits {
    public static void main(String[] args) {
        int num=1234,count=0,sum=0;
        

        while(num>0){
            sum+=num%10;
            num/=10;
            count++;

        }
        System.out.println("count:"+count+" sum:"+sum);
    }
    
}
