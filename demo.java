import  java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        System.out.println("hollo javed punda");
    
    }

    void Main(int n,int m){
        System.out.println(n+m);
    }

}
     
    class demoe {

    public static void main(String[] args) {
        System.out.println("hollo javed punda");
        
       demo remo=new demo();
        demo.main(null);  
        
        Scanner get=new Scanner(System.in);

        int m=get.nextInt();
        int n=get.nextInt();
     
        remo.Main(m, n);
     
        get.close();
    
    }
}