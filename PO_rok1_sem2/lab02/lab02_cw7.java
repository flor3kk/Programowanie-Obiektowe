package lab02;

import java.util.Scanner;

public class lab02_cw7 {

    public static void main(String[] args) {
        System.out.println("podaj ile elemetnow chcesz wprowadzic: ");
        int a = InputInt();
        int[] tab = new int[a];
        tabin(a, tab);
        sort(a, tab);
    }

    public static int InputInt(){
        Scanner skaner = new Scanner(System.in);
        return skaner.nextInt();
    }

    public static void tabin(int a, int[] tab){
        for(int i = 0; i < a; i++){
            System.out.println("podaj liczbe do tablicy o indeksie: ["+i+"]");
            tab[i] = InputInt();
        }
    }

    public static void sort(int a, int[] tab){
        for(int i = 0; i < a - 1; i++){
            for(int j = 0; j < a - i - 1; j++){
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }

        System.out.println("oto twoja posortowana tablica");
        for(int i = 0; i < a; i++){
            System.out.print(tab[i] + " ");
        }
    }
}
