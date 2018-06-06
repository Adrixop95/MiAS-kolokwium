package MiAS;

public class Drukarka implements INotatka {
    
    public Drukarka() {
	;
    }

    public final void Drukuj() {
	System.out.println("Trwa drukowanie...");
    }

    public final void Wyslij() {
	System.out.println("Blad wyslania wiadomosci (drukarka)");
    }
}