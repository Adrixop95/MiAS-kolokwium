package MiAS;

public abstract class Platnosc {
    
    protected double kwotaPlatnosci;
    
    public void zaplac(Zamowienie zamowienie){
        ;
    }

    public void wydrukPotwierdzenia() {
    System.out.println("Zaplacono " + this.kwotaPlatnosci + "\n");
    }
}