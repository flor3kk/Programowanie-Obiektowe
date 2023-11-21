package dziedziczenie;

public class Szefito extends Pracownik{
    int premia;

    public Szefito(String imie, String nazwisko, int wyplata, int premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }

    @Override
    public String toString() {
        return "szefito{" +
                "premia=" + premia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
}
