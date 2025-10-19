
class main{
    protected String name="dog";

    static void sound(){
        System.out.println("woof.....");
    }
}


public class Animal {
    public static void main(String[] args) {
        main a=new main();
        System.out.println("Animal:"+a.name);
        a.sound();
    }
    
}
