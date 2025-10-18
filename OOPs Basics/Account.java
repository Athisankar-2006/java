
class main{
    private double balance=5000;

    public void deposite(double m){
        balance+=m;

    }
    public double getbalance(){
        return balance;
    }

}



public class Account {
    public static void main(String[] args) {
        main a=new main();
        a.deposite(1500);
        a.deposite(20000);
        System.out.println("balance:"+a.getbalance());
    }
    
}
