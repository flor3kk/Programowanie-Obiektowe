package klonowane;

public class Main {
    public static void main(String[] args) {
        Gatunek gat = new Gatunek();
        gat.setNazwaRodzaju("ptaszek");
        gat.setNazwaGatunku("cos");
        gat.setLch2n(4);
        gat.setLchx(444);
        gat.wypisz();
//        Gatunek a = gat.klonuj();
//        a.wypisz();
    }
}