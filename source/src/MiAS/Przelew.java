package MiAS;

public class Przelew extends Platnosc {
    
    private String Kontobankowe;
    private String Tytulprzelewu;

    public Przelew(String Kontobankowe, String Tytulprzelewu, double kwotaPlatnosci) {
        this.Kontobankowe = Kontobankowe;
        this.Tytulprzelewu = Tytulprzelewu;
	this.kwotaPlatnosci = kwotaPlatnosci;
    }

    public final void zaplac(Zamowienie zamowienie) {
        System.out.println("Doszedl przelew " + this.Tytulprzelewu + " na kwote "
                + this.kwotaPlatnosci + " z " + this.Kontobankowe);
    }
    
}