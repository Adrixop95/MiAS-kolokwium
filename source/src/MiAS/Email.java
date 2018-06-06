package MiAS;

public class Email implements INotatka {
    
    public String adres_email;

    public Email(String adres_email) {
	this.adres_email = adres_email;
    }

    public final void Drukuj() {
    	System.out.println("Blad wyszukiwania drukarki w sieci");
    }

    public final void Wyslij() {
	System.out.println("Wiadomosc wyslana do: " + this.adres_email);
    }
}