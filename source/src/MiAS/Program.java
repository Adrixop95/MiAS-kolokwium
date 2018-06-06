package MiAS;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        spr_zamowienie();
        spr_gotowka();
        spr_kredyt();
        spr_przelew();
        test_zamowienia();
        
    }
    
    public static void spr_zamowienie(){
        
        PozycjaZamowienia zamowienie = new PozycjaZamowienia("Blabla", 100, 23, 10);
        
        System.out.println("Podatek: " + zamowienie.obliczPodatek());
        System.out.println("Brutto: " + zamowienie.obliczBrutto());
        
    }
    
    public static void spr_gotowka() {
        
        Gotowka gotowka = new Gotowka(100);
        gotowka.wydrukPotwierdzenia();
        
    }
    
    public static void spr_kredyt(){
        
        Kredyt kredyt = new Kredyt("nazwa_banku", (short)1, 23.0, 123);
        kredyt.wydrukPotwierdzenia();   
        
    }
    
    public static void spr_przelew() {
        
        Przelew przelew = new Przelew("Konto dla mlodych", "Opłata przelewem", 123);
        przelew.wydrukPotwierdzenia();
        
    }
    
    public static void test_zamowienia(){
        
        Zamowienie zamowienie = new Zamowienie(LocalDateTime.now(), false, "001", false);
        
        zamowienie.dadajPozycjeZamowienia(new PozycjaZamowienia("Mak", 2.50, 8, 1));
        zamowienie.dadajPozycjeZamowienia(new PozycjaZamowienia("Krem", 10, 23, 5));
        zamowienie.dadajPozycjeZamowienia(new PozycjaZamowienia("Laptop", 2999.99, 23, 1));
        
        System.out.println(zamowienie.wartoscZamowienia());
        System.out.println(zamowienie.wartoscPodatku());

        zamowienie.oplacZamownienie(new Gotowka(1234.56));
        zamowienie.oplacZamownienie(new Kredyt("ING Bank Polski", (short)1, 23.0, 56.23));
        zamowienie.oplacZamownienie(new Przelew("Konto dla mlodych", "Opłata przelewem", 56.23));
        
    }

}