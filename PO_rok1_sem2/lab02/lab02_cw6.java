package lab02;

import java.util.Scanner;

public class lab02_cw6 {
    public static void main(String[] args) {
        int a = 1;
        while (a >= 0){
            System.out.println("podaj liczbe całkowita ( < 0 - wyjscie): ");
            a = inputInt();
            if(a < 0){
                System.out.print("koniec");
                break;
            }
        }


    }

    public static int inputInt(){
        Scanner skaner = new Scanner(System.in);
        int liczba = skaner.nextInt();
        return liczba;
    }

}
