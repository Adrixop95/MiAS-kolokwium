package MiAS;

public class Kredyt extends Platnosc {
    
    private short liczbaRat;
    private String Bank;
    private double oprocentowanieRoczne;

    public Kredyt(String Bank, short liczbaRat, double oprocentowanieRoczne, double kwotaPlatnosci) {
    	this.Bank = Bank;
	this.liczbaRat = liczbaRat;
	this.oprocentowanieRoczne = oprocentowanieRoczne;
	this.kwotaPlatnosci = kwotaPlatnosci;
    }

    public final void zaplac(Zamowienie zamowienie) {
	super.zaplac(zamowienie);
	System.out.println("Zaplacono rate " + this.liczbaRat + " na kwote " + this.kwotaPlatnosci + "\n");
	this.liczbaRat--;
    }
}