package MiAS;

import java.util.*;
import java.time.*;

public class Zamowienie {
	
    private LocalDateTime dataRealizacji = LocalDateTime.MIN;
    private boolean statusZamowienia;
    private String IdentyfikatorZamowienia;
    private ArrayList<PozycjaZamowienia> Lista_pozycjiZamowienia;
    private boolean potwierdzenieElektroniczne;

    public Zamowienie(LocalDateTime dataRealizacji, boolean statusZamowienia, String IdZamowienia, boolean potwierdzenieElektroniczne) {
        this.Lista_pozycjiZamowienia = new ArrayList<PozycjaZamowienia>();
        this.dataRealizacji = dataRealizacji;
        this.statusZamowienia = statusZamowienia;
        this.IdentyfikatorZamowienia = IdZamowienia;
	this.potwierdzenieElektroniczne = potwierdzenieElektroniczne;
    }

    public final double wartoscZamowienia() {
        double koszt = 0;

        for (PozycjaZamowienia p : this.Lista_pozycjiZamowienia) {
            koszt += p.obliczBrutto();
	}
	
        return Math.round(koszt * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public final double wartoscPodatku() {

        double podatek = 0;
	for (PozycjaZamowienia p : this.Lista_pozycjiZamowienia) {
            podatek += p.obliczPodatek();
	}
	
        return Math.round(podatek * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public final boolean oplacZamownienie(Gotowka g) {

        if (this.statusZamowienia) {
            System.out.println("Zamowienie oplacone \n");
            return false;
	}

        this.statusZamowienia = true;
	g.zaplac(this);
	this.drukujPotwierdzenie();
	g.wydrukPotwierdzenia();
	
	return this.statusZamowienia;
    }

    public final boolean oplacZamownienie(Kredyt k) {
    
        if (this.statusZamowienia) {
            System.out.println("Zamowienie oplacone \n");
            return false;
	}

        this.statusZamowienia = true;
	k.zaplac(this);
	this.drukujPotwierdzenie();
	k.wydrukPotwierdzenia();

	return this.statusZamowienia;
    }

    public final boolean oplacZamownienie(Przelew p) {
		
        if (this.statusZamowienia) {
            System.out.println("Zamowienie oplacone \n");
            return false;
	}

	this.statusZamowienia = true;
	p.zaplac(this);
	this.drukujPotwierdzenie();
	p.wydrukPotwierdzenia();
	
        return this.statusZamowienia;
    }

    public final void drukujPotwierdzenie() {
        
        INotatka inotatka;
        Drukarka d = new Drukarka();
	Email e = new Email("test@test.com");

	if (potwierdzenieElektroniczne) {
            inotatka = (INotatka) e;
            inotatka.Wyslij();
	} else {
            inotatka = (INotatka) d;
            inotatka.Drukuj();
	}
    }

    public final boolean dadajPozycjeZamowienia(PozycjaZamowienia pozycja) {    
        
        this.Lista_pozycjiZamowienia.add(pozycja);
	
        if (this.Lista_pozycjiZamowienia.get(this.Lista_pozycjiZamowienia.size() - 1).equals(pozycja)) {
            return true;
	}
	
        return false;
    }
}