class main{
    String name;
    int age;

    main(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("name: "+name + "age:"+age);
    }
}

public class Employee {
    public static void main(String[] args) {
        main s1=new main("athi",23);
        s1.show();
        
    }
    
}
