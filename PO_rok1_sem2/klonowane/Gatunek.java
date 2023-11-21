package klonowane;

public class Gatunek {
    private String nazwaRodzaju;
    private String nazwaGatunku;
    private int lch2n;
    private int lchx;

    public Gatunek() {
    }
    //    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int lch2n, int lchx) {
//        this.nazwaRodzaju = nazwaRodzaju;
//        this.nazwaGatunku = nazwaGatunku;
//        this.lch2n = lch2n;
//        this.lchx = lchx;
//    }

    public void setNazwaRodzaju(String nazwaRodzaju) {
        this.nazwaRodzaju = nazwaRodzaju;
    }

    public void setNazwaGatunku(String nazwaGatunku) {
        this.nazwaGatunku = nazwaGatunku;
    }

    public void setLch2n(int lch2n) {
        this.lch2n = lch2n;
    }

    public void setLchx(int lchx) {
        this.lchx = lchx;
    }

    public void wypisz(){
        System.out.println("Rodzaj: "+nazwaRodzaju+"\nGatunek: "+nazwaGatunku+"\nLiczba chromosomow 2n: "+lch2n+"\nLiczba chromosomow x: "+lchx);
    }

//    public Gatunek klonuj(){
//        return new Gatunek(nazwaRodzaju, nazwaGatunku, lch2n, lchx);
//    }
}
