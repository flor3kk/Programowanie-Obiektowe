import java.util.*;
public class Main {
    public static void main(String[] args)
    {

        /*
        System.out.println("Hello world!");

        int x;
        float y = 2.4343f; // f F
        double z = 43.2321331231212123d; // d D
        char s = '$';
        String tekst = "sample text";
        final int max = 32; // stala wartosc
        short l1;
        long l2; // L
        boolean human = false; // true
        var res = 11+12.43;

        System.out.println("imie: ");
        String g = skaner.next();
        System.out.println("witam: " + g);
        */

        //Zadanie 1
        System.out.println(Name());
        System.out.println(Wiek());
        System.out.println(przerwa());

        //Zadanie 2
        float a = inputFloat();
        float b = inputFloat();
        Dzaialnia(a,b);
        System.out.println();
        System.out.println(przerwa());

        //Zadanie 3
        System.out.println(czyParzysta(23));
        System.out.println(przerwa());

        //Zadanie 4
        System.out.println(czy3i5(15));
        System.out.println(przerwa());

        //losowanie liczb
/*      Random rand = new Random();
        int l = rand.nextInt(10)-5;
        System.out.println(l);
        System.out.println(przerwa());
*/

        //wzor na liczby z przedzialu od q do w
/*      int q = -12;
        int w = 23;
        int e = rand.nextInt(w-q+1)+q;
        System.out.println("ahA: " + e);
*/

        //Zadanie 5
        System.out.println("potega: " + Power(2));
        System.out.println(przerwa());

        //Zadanie 6
        System.out.println("pierwisatek: " + Pierwiastek(4));
        System.out.println(przerwa());

        //Zadanie 7
        int m = inputInt();
        int n = inputInt();
        Random los = new Random();
        System.out.println(Triangle(los.nextInt(m)+n, los.nextInt(m)+n, los.nextInt(m)+n));
    }

    public static String przerwa(){
        return "===============================";
    }
    public static float inputFloat(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        float a = skaner.nextFloat();
        return a;
    }

    public static int inputInt(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj zakres: ");
        int a = skaner.nextInt();
        return a;
    }

    //Zadanie 1
    public static String Name() {
        return "Bartek";
    }
    public static int Wiek() {
        return 20;
    }

    //Zadanie 2
    public static void Dzaialnia(float a, float b){
        System.out.println("suma: " + a + " + " + b + " = " + (a+b));
        System.out.println("roznica: " + a + " - " + b + " = " + (a-b));
        System.out.format("iloczyn: %.3f * %.2f = %.4f", a, b, (a * b));
        // %c %d %f %s %t - time
    }

    //Zadanie 3
    public static boolean czyParzysta(int a){
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    //Zadanie 4
    public static boolean czy3i5(int a){
        if (a % 3 == 0 && a % 5 == 0)
            return true;
        else
            return false;
    }

    //Zadanie 5
    public static double Power(int a){
        return Math.pow(a, 3);
    }

    //Zadnaie 6
    public static double Pierwiastek(int a){
        return Math.sqrt(a);
    }

    //Zadanie 7
    public static boolean Triangle(double a, double b, double c){
        a = Math.pow(a,2);
        b = Math.pow(b,2);
        c = Math.pow(c,2);
        System.out.println(a + " " + b + " " + c);
        if(a + b == c)
            return true;
        else if (a + c == b)
            return true;
        else if (b + c == a)
            return true;
        else
            return false;

    }
/*
    public static void MathExample(){
        System.out.println(Math.abs(-4));
        System.out.println(Math.round(2.434343343334F));
        System.out.println(Math.ceil(23.424141212F));
        System.out.println(Math.floor(23.42414121F));
        System.out.println(Math.log10(2)); //log(2)
        System.out.println(Math.log1p(32.23F));
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,4));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.min(32,12)); //max()
    }
*/
}