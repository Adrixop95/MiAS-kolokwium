package MiAS;

public class Gotowka extends Platnosc {
    
    public Gotowka(double kwotaPlatnosci) {
    this.kwotaPlatnosci = kwotaPlatnosci;
    }

    public final void zaplac(Zamowienie zamowienie) {
    	super.zaplac(zamowienie);
	System.out.println("Zaplacono gotowka: " + this.kwotaPlatnosci + "\n");
    }
}