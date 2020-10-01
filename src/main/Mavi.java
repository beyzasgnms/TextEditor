package main;

import java.awt.Color;
import javax.swing.JTextPane;

public class Mavi implements Renk {

    @Override
    public void renkDegistir(JTextPane textarea) {
        textarea.setBackground(Color.blue);
    }
}
