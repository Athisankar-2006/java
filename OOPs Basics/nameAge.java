class main{
    String name;
    int age;
    void display(){
        System.out.println("Name:"+name + " Age:"+age);
    }
}


public class nameAge {
    public static void main(String[] args) {
        main s1=new main();
        s1.name="Athi";
        s1.age=21;
        s1.display();
    }
    
}
