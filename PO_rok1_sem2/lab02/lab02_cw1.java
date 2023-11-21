package lab02;

import java.util.Scanner;
public class lab02_cw1 {
        public static void main(String[] args) {
            Row_kw();

        }

        public static double Input_kw(){
            Scanner skaner = new Scanner(System.in);
            double liczba = skaner.nextDouble();
            return liczba;
        }
        public static void Row_kw(){
            System.out.println("podaj a: ");
            double a = Input_kw();
            System.out.println("podaj b: ");
            double b = Input_kw();
            System.out.println("podaj c: ");
            double c = Input_kw();

            if (a != 0){
                double delta = Delta(a, b, c);
                if(delta < 0)
                    System.out.println("brak rozwiazan");
                else if (delta == 0)
                    System.out.format("jedno rozwiazanie: x1 = %.2f", (-b/(2*a)));
                else
                    System.out.format("dwa rozwiazania: x1 = %.2f, x2 = %.2f",
                            (-b - Math.sqrt(delta))/ (2 * a), (-b - Math.sqrt(delta)) / (2 * a));

            }else System.out.println("brak rownania kwadratowego");
        }

        public static double Delta(double a, double b, double c){
            return Math.pow(b, 2) - 4 * a * c;
        }

}
