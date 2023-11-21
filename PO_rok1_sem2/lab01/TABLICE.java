import java.util.Scanner;

public class TABLICE {

    public static void main(String[] args){
/*        viewtab(returnArray());
        reverseviewtab(returnArray());
        oddindex(returnArray());
        evenindex(returnArray());*/
        sumarr(returnArray());
        multiplearr(returnArray());
    }

    public static int inputInt(){
        Scanner skan = new Scanner(System.in);
        int num = skan.nextInt();
        return num;
    }
    public static int[] returnArray(){
        final int arrayLen = 10;
        int[] arr = new int[arrayLen];
        System.out.println("podaj elementy tablicy: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputInt();
        }
        return arr;
    }

    public static void viewtab(int[] tab){
        System.out.println("\nelementy tablicy");
        for (int item:tab) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void reverseviewtab(int[] tab){
        System.out.println("\nelementy odwrocone");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void oddindex(int[] tab){
        System.out.println("\nelementy o nieparzystych indeksach");
        for(int i = 0; i < tab.length; i++){
            if(i % 2 != 0){
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }

    public static void evenindex(int[] tab){
        System.out.println("\nelementy o parzystych indeksach");
        for(int i = 0; i < tab.length; i++){
            if(i % 2 == 0){
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }

    public static void sumarr(int[] tab){
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("suma tablicy: " + sum);
    }

    public static void multiplearr(int[] tab){
        int multiple = 1;
        for (int i = 0; i < tab.length; i++) {
            multiple *= tab[i];
        }
        System.out.println("iloczyn tablicy: " + multiple);
    }
}
