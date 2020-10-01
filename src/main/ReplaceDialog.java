
package main;

import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Stack;
import javax.swing.JTextPane;

public class ReplaceDialog extends javax.swing.JFrame {

    /** Creates new form ReplaceDialog */
    public ReplaceDialog() {
        initComponents();
    }

    TextRepository tr;
    Iterator i;
    Stack s = TextEditorGUI.stack;
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        eskiKelime = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        yeniKelime = new javax.swing.JTextField();
        degistirButton = new javax.swing.JButton();
        cikButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Değiştir");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        label1.setText("Değiştirilecek kelimeyi girin:");

        eskiKelime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eskiKelimeKeyPressed(evt);
            }
        });

        label2.setText("Yeni kelimeyi girin:");

        yeniKelime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yeniKelimeKeyPressed(evt);
            }
        });

        degistirButton.setText("Değiştir");
        degistirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirButtonActionPerformed(evt);
            }
        });

        cikButton.setText("Çık");
        cikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eskiKelime, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yeniKelime, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(degistirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(cikButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eskiKelime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yeniKelime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degistirButton)
                    .addComponent(cikButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Çık butonuna basınca değiştirme ekranı kapatılıyor
    private void cikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cikButtonActionPerformed

    // Değiştir butonuna basınca değiştirme işlemi yapılıyor
    private void degistirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirButtonActionPerformed
        // Var olan metin alınıyor
        String oldText = TextEditorGUI.textArea.getText();
        String newText = "";
        JTextPane textArea = TextEditorGUI.textArea;
        tr = new TextRepository();
        // Iterator oluşturuluyor
        i = tr.getIterator();
        
        // Iteratorde kelime var olduğu sürece bu döngü çalışıyor
        while(i.hasNext()) {
            // Iteratorun göstermiş olduğu kelime alınıyor ve
            String word = (String)i.next();
            // Kullanıcının girdiği kelimeyle karşılaştırılıyor
            if(word.equals(eskiKelime.getText())) {
                // Kelimeler aynıysa değişim işlemi yapılıyor
                newText = oldText.replace(eskiKelime.getText(), yeniKelime.getText());
                textArea.setText(newText);
                // Metinleri tutan yığıta yeni metin ekleniyor
                s.push(newText);
                break;
            }
        }
    }//GEN-LAST:event_degistirButtonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) degistirButton.doClick();
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) cikButton.doClick();
    }//GEN-LAST:event_formKeyPressed

    private void eskiKelimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eskiKelimeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) degistirButton.doClick();
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) cikButton.doClick();
    }//GEN-LAST:event_eskiKelimeKeyPressed

    private void yeniKelimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yeniKelimeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) degistirButton.doClick();
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) cikButton.doClick();
    }//GEN-LAST:event_yeniKelimeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReplaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReplaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReplaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReplaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReplaceDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikButton;
    private javax.swing.JButton degistirButton;
    private javax.swing.JTextField eskiKelime;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField yeniKelime;
    // End of variables declaration//GEN-END:variables

}