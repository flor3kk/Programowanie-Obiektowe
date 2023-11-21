import java.util.Scanner;

public class petle2 {
    public static void main(String[] args){
        Numbers(10);
    }

    public static int Input(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static void Numbers(int a){
        int num_pos = 0;
        int num_neg = 0;
        int count_pos = 0;
        int count_neg = 0;
        for(int i = 0; i < a; i++){
            System.out.println("podaj liczbe nr: " + (i+1));
            int b = Input();
            if(b >= 0){
                num_pos += b;
                count_pos++;
            }
            else{
                num_neg += b;
                count_neg++;
            }
        }
        System.out.println("liczby na plusie: " + num_pos + ", ich ilosc: " + count_pos);
        System.out.println("liczby na minusie: " + num_neg + ", ich ilosc: " + count_neg);
    }

}
