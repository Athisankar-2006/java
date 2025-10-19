
class main{
    static int count=0;
    static void counter(){
        count++;
        System.out.print("object count: "+count);
    }
}


public class Counter {
    public static void main(String[] args) {
        main c= new main();
        c.counter();
        c.counter();
        c.counter();
    }
    
}
