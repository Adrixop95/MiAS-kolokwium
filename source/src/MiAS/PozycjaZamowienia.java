package MiAS;

public class PozycjaZamowienia {
    
    private String nazwaTowaru;
    private double cenaJednostkowa;
    private int stawkaVAT;
    private float Ilosc;
    
    public PozycjaZamowienia(String nazwaTowaru, double cenaJednostkowa, int stawkaVAT, float Ilosc) {
        this.nazwaTowaru = nazwaTowaru;
	this.cenaJednostkowa = cenaJednostkowa;
	this.stawkaVAT = stawkaVAT;
	this.Ilosc = Ilosc;
    }

    public final double obliczBrutto() {
        return this.Ilosc * this.cenaJednostkowa + this.obliczPodatek();
    }

    public final double obliczPodatek() {
        return this.stawkaVAT * (this.cenaJednostkowa * this.Ilosc) / 100;
    }
}