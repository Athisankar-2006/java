public class VowelCheck {
    public static void main(String[] args) {
        char a='e';
        switch (a) {
            case 'a':case 'e': case 'i': case 'o': case 'u': 
                System.out.println("it is a vowel");
                break;
            default:
            System.out.println("it is a consonent");
                break;
        }
    }
    
}
