package main;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class OrtayaHizala implements HizalamaStrategy {

    @Override
    public JTextPane hizala(JTextPane textarea) {
        SimpleAttributeSet sa = new SimpleAttributeSet();
        StyleConstants.setAlignment(sa, StyleConstants.ALIGN_CENTER);
        textarea.getStyledDocument().setParagraphAttributes(0, textarea.getText().length(), sa, false);
        return textarea;
    }
}
