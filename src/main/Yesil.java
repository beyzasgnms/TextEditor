package main;

import java.awt.Color;
import javax.swing.JTextPane;

public class Yesil implements Renk {

    @Override
    public void renkDegistir(JTextPane textarea) {
        textarea.setBackground(Color.green);
    }
}
