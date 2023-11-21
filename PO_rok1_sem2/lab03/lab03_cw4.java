package lab03;

import java.util.Random;
import java.util.Scanner;

public class lab03_cw4 {

    public static void main(String[] args){
        System.out.println("podaj ile wylosowac liczb: ");
        int a = InputNum();
        int[] tab = new int[a];
        System.out.println("oto twoje wylosowane liczby: ");
        Rand(a, tab);
        System.out.println();
        System.out.println("suma parzystych liczb: ");
        System.out.println(Sum(a, tab));
    }

    public static int InputNum(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static int Rand(int a, int[] tab){
        Random los = new Random();
        for(int i = 0; i < a; i++){
            tab[i] = los.nextInt(45)-10;
            System.out.print(tab[i] + ", ");
        }
        return 0;
    }

    public static int Sum(int a, int[] tab){
        int sum = 0;
        for(int i = 0; i < a; i++){
            if(tab[i] % 2 == 0){
                sum += tab[i];
            }
        }
        return sum;
    }
}
