import java.util.Scanner;
public class petle1 {
    public static void main(String[] args){
        System.out.println("podaj ilu uczniow: ");
        int a = Input();
        Students(a);
    }

    public static int Input(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static void Students(int a){
        int sum = 0;
        int count = 0;
        int b  = 0;
        while(b < a){
            System.out.println("podaj punkty ucznia nr: " + (b + 1));
            int c = Input();
            sum += c;
            count++;
            b++;
        }
        System.out.println("srednia ilosc punktow: " + sum / count);
    }
}
