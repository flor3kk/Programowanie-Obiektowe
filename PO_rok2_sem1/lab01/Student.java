package programowanie_rok2_lab1;

import java.util.Date;

public class Student {

    private String imie;
    private String nazwisko;
    private long nr_albumu;
    Date data = new Date();

    Student() {}

    Student(String imie, String nazwisko, long nr_albumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_albumu = nr_albumu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getNr_albumu() {
        return nr_albumu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNr_albumu(long nr_albumu) {
        this.nr_albumu = nr_albumu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nr_albumu=" + nr_albumu +
                ", data=" + data +
                '}';
    }
}
