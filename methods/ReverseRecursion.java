public class ReverseRecursion {

    static String reverse(String str1){
        if (str1.isEmpty()){
            return str1;
        }
        return reverse(str1.substring(1))+str1.charAt(0);
    }
    public static void main(String[] args) {
        String str="hellow";
        System.out.println("reversed string is "+ reverse(str));
    }
    
}
