import java.util.Scanner;

public class cw2 {
        public static void main(String[] args){
            Run();
        }

        public static void Run(){
            while(true){
                Menu();
            }
        }

        public static void Menu(){
            System.out.println("wybierz: \n1.suma" +
                "\n2.roznica\n3.iloczyn\n4.Iloraz\n5.potega\n6.pierwiastek" +
                "\n7.funkcje tryg\n8.wyjscie");

            int num = InputInt();
            switch (num){
                case 1 -> Suma();
                case 2 -> Roznica();
                case 3 -> Iloczyn();
                case 4 -> Iloraz();
                case 5 -> Potega();
                case 6 -> Pierwiastek();
                case 7 -> funTryg();
                case 8 -> Close();
            }

            String cont = "";
            while (!(cont.equals("t")) || !(cont.equals("n"))) {
                System.out.println("kontynuowac?: t/n");
                cont = inputStr();
                if (cont.equals("t")) {Menu(); }
                else if (cont.equals("n")) {Close(); }
            }
        }

        public static int InputInt(){
            Scanner skaner = new Scanner(System.in);
            return skaner.nextInt();
        }
        public static String inputStr(){
            Scanner skaner_str = new Scanner(System.in);
            String tekst = skaner_str.nextLine();
            return tekst;
        }

        public static void Suma(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("s4uma: " + a + " + " + b + " = " + (a+b));
        }

        public static void Roznica(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("suma: " + a + " - " + b + " = " + (a-b));
        }

        public static void Iloczyn(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("suma: " + a + " * " + b + " = " + (a*b));
        }

        public static void Iloraz(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = 0;
            while (b == 0){
                System.out.println("nie przez zero");
                b = InputInt();
            }
            System.out.println("iloraz: " + a + " / " + b + " = " + (a/b));
        }

        public static void Potega(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("do jakiej potegi: ");
            int b = InputInt();
            System.out.println("suma: " + a + " ^ " + b + " = " + Math.pow(a,b));
        }

        public static void Pierwiastek(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("pierwisatek z : " + a + " = " + Math.sqrt(a));
        }

        public static void funTryg(){
            int a = -1;
            while (a < 0 || a > 360){
                System.out.println("podaj ile stopni: ");
                a = InputInt();
            }
            System.out.println("Sin: " + Math.sin(a) + ", Cos: " + Math.cos(a) + ", Tg: " + Math.tan(a));
        }

        public static void Close(){
            System.out.println("trzymaj sie");
            System.exit(0);
        }
}