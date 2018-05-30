/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author adria
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class zamowienie extends platnosc {
    
    private DateFormat dataRealizacji = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
    private boolean statusZamowienia = false;
    private String identyfikatorZamowienia = "";
    private int[] Lista_pozycjiZamowienia = new int[0];
    private boolean potwierdzenieElektroniczne = false;

    
    public static double wartoscZamowienia(){
        
        return 0;
    }
    
    public static double wartoscPodatku() {
        
        return 0;
    }
    
    public static boolean oplacZamowienie (Class platnosc){
        
        return false;
    }
    
    public static void drukujPotwierdzenie(){
        
        
    }
    
    public static boolean dodajPozycjeZamowienia(Class pozycja_zamowienia){
        
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
