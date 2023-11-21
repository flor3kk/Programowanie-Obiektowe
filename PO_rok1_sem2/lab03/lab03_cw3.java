package lab03;

import java.util.Scanner;

public class lab03_cw3 {

    public static void main(String[] args){
        System.out.println("podaj zakres");
        int a = Input();
        Even(a);
    }

    public static int Input(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static void Even(int a){
        int sum = 0;
        for (int i = 0; i < a; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("suma parzysych liczb w ciagu: " + sum);
    }
}
