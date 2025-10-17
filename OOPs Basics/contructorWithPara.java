class main{
    String name;
    int age;
    main(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("name:"+name+ " age:"+age);
    }
}




public class contructorWithPara {
    public static void main(String[] args) {
        main s1=new main("athi", 21);
        s1.display();
    }
    
}
