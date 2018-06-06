package MiAS;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

    // Sprawdzenie PozycjaZamówniea
    PozycjaZamowienia PZ = new PozycjaZamowienia("Cos", 1, 23, 10);
    System.out.println("1zl, VAT=23, n=10");
    System.out.println("Podatek: " + PZ.obliczPodatek());
    System.out.println("Brutto: " + PZ.obliczBrutto());

    // Sprawdzenie Gotókwa
    System.out.println("\n========================================");
    System.out.println("Test wydrukow potwierdzenia platnosci");
    Gotowka got = new Gotowka(20);
    got.wydrukPotwierdzenia();

    // Sprawdzenie Kredyt
    Kredyt kre = new Kredyt("PKO Bank Polski", (short)1, 23.0, 25);
    kre.wydrukPotwierdzenia();

    // Sprawdzenie Gotókwa
    Przelew prze = new Przelew("Konto osobiste", "Opłata przelewem", 164);
    prze.wydrukPotwierdzenia();

    // Sprawdzenie Zamówienie
    System.out.println("\n========================================");
    System.out.println("Test zamowienia");
    Zamowienie zam = new Zamowienie(LocalDateTime.now(), false, "001", false);
    zam.dadajPozycjeZamowienia(new PozycjaZamowienia("Cos", 100.00, 23, 3));
    zam.dadajPozycjeZamowienia(new PozycjaZamowienia("Kawa", 4.50, 8, 3));
    zam.dadajPozycjeZamowienia(new PozycjaZamowienia("Ciastko", 8.99, 8, 3));
    System.out.println(zam.wartoscZamowienia());
    System.out.println(zam.wartoscPodatku());

    System.out.println("\n========================================");
    zam.oplacZamownienie(new Gotowka(412.71));
    System.out.println("\n========================================");
    zam.oplacZamownienie(new Kredyt("PKO Bank Polski", (short)3, 23.0, 412.71));
    System.out.println("\n========================================");
    zam.oplacZamownienie(new Przelew("Konto osobiste", "Opłata przelewem", 412.71));
    }

}