package main;

import javax.swing.JTextPane;

public class RenkFactory implements Renk {
    
    Renk renk;
    
    public Renk getRenk(String r) {
        if(r == null) {
            return null;
        }
        // Verilen parametreye göre uygun Renk nesnesi oluşturuluyor
        if(r.equalsIgnoreCase("beyaz")){
            renk = new Beyaz();
            return renk;
        }
        else if(r.equalsIgnoreCase("kirmizi")) {
            renk = new Kirmizi();
            return renk;
        }
        else if(r.equalsIgnoreCase("mavi")) {
            renk = new Mavi();
            return renk;
        }
        else if(r.equalsIgnoreCase("pembe")) {
            renk = new Pembe();
            return renk;
        }
        else if(r.equalsIgnoreCase("yesil")) {
            renk = new Yesil();
            return renk;
        }
        
        return null;
    }

    @Override
    public void renkDegistir(JTextPane textarea) {}
}
