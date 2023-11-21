package dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Pracownik prac = new Pracownik("Jan", "Nowak", 2500);

        Szefito szef = new Szefito("Janina", "Nowak", 2500, 555555);

        System.out.println(prac.toString());
        System.out.println(szef.toString());
    }
}
