import java.util.Scanner;

public class petla5 {

    public static void main(String[] args)
    {
        System.out.println("podaj slowo: ");
        String text = InputStr();
        System.out.println(Palindrom(text));
    }

    public static String InputStr(){
        Scanner skan = new Scanner(System.in);
        return skan.next();
    }

    public static boolean Palindrom(String text){
        for(int i = 0; i < text.length() / 2; i++){
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
