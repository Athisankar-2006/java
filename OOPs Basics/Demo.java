
class main{
    static{
        System.out.println("this is a static block executed!..");
    }

    main(){
        System.out.println(" contruction executed ");
    }
}


public class Demo {
    public static void main(String[] args) {
        main m= new main();
        
    }
    
}
