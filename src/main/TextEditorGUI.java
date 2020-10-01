package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TextEditorGUI extends javax.swing.JFrame {

    public TextEditorGUI() {
        initComponents();
    }
    
    static boolean saved = false;
    static String path;
    static FindDialog find;
    static ReplaceDialog replace;
    UndoCommand undo;
    static HizalamaStrategy hiza;
    static RenkFactory rf = new RenkFactory();
    
    static Stack stack = new Stack();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        editorPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        menuBar = new javax.swing.JMenuBar();
        dosyaMenuBar = new javax.swing.JMenu();
        yeniDosyaMenu = new javax.swing.JMenuItem();
        dosyaAcMenu = new javax.swing.JMenuItem();
        kaydetMenu = new javax.swing.JMenuItem();
        seperator = new javax.swing.JPopupMenu.Separator();
        cikisMenu = new javax.swing.JMenuItem();
        duzenleMenuBar = new javax.swing.JMenu();
        bulMenu = new javax.swing.JMenuItem();
        degistirMenu = new javax.swing.JMenuItem();
        geriAlMenu = new javax.swing.JMenuItem();
        bicimMenuBar = new javax.swing.JMenu();
        solaHizalaMenu = new javax.swing.JMenuItem();
        sagaHizalaMenu = new javax.swing.JMenuItem();
        ikiYanaHizalaMenu = new javax.swing.JMenuItem();
        ortalaMenu = new javax.swing.JMenuItem();
        renkMenuBar = new javax.swing.JMenu();
        beyaz = new javax.swing.JMenuItem();
        kirmizi = new javax.swing.JMenuItem();
        mavi = new javax.swing.JMenuItem();
        pembe = new javax.swing.JMenuItem();
        yesil = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
        scrollPane.setViewportView(textArea);

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
        editorPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        editorPanelLayout.setVerticalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        dosyaMenuBar.setText("Dosya");

        yeniDosyaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        yeniDosyaMenu.setText("Yeni");
        yeniDosyaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniDosyaMenuActionPerformed(evt);
            }
        });
        dosyaMenuBar.add(yeniDosyaMenu);

        dosyaAcMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        dosyaAcMenu.setText("Aç");
        dosyaAcMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaAcMenuActionPerformed(evt);
            }
        });
        dosyaMenuBar.add(dosyaAcMenu);

        kaydetMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        kaydetMenu.setText("Kaydet");
        kaydetMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetMenuActionPerformed(evt);
            }
        });
        dosyaMenuBar.add(kaydetMenu);
        dosyaMenuBar.add(seperator);

        cikisMenu.setText("Çıkış");
        cikisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisMenuActionPerformed(evt);
            }
        });
        dosyaMenuBar.add(cikisMenu);

        menuBar.add(dosyaMenuBar);

        duzenleMenuBar.setText("Düzenle");

        bulMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        bulMenu.setText("Bul");
        bulMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulMenuActionPerformed(evt);
            }
        });
        duzenleMenuBar.add(bulMenu);

        degistirMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        degistirMenu.setText("Değiştir");
        degistirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirMenuActionPerformed(evt);
            }
        });
        duzenleMenuBar.add(degistirMenu);

        geriAlMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        geriAlMenu.setText("Geri Al");
        geriAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriAlMenuActionPerformed(evt);
            }
        });
        duzenleMenuBar.add(geriAlMenu);

        menuBar.add(duzenleMenuBar);

        bicimMenuBar.setText("Biçim");

        solaHizalaMenu.setText("Sola Hizala");
        solaHizalaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solaHizalaMenuActionPerformed(evt);
            }
        });
        bicimMenuBar.add(solaHizalaMenu);

        sagaHizalaMenu.setText("Sağa Hizala");
        sagaHizalaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagaHizalaMenuActionPerformed(evt);
            }
        });
        bicimMenuBar.add(sagaHizalaMenu);

        ikiYanaHizalaMenu.setText("İki Yana Hizala");
        ikiYanaHizalaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiYanaHizalaMenuActionPerformed(evt);
            }
        });
        bicimMenuBar.add(ikiYanaHizalaMenu);

        ortalaMenu.setText("Ortala");
        ortalaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ortalaMenuActionPerformed(evt);
            }
        });
        bicimMenuBar.add(ortalaMenu);

        menuBar.add(bicimMenuBar);

        renkMenuBar.setText("Arkaplan Rengi");

        beyaz.setText("Beyaz");
        beyaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beyazActionPerformed(evt);
            }
        });
        renkMenuBar.add(beyaz);

        kirmizi.setText("Kırmızı");
        kirmizi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirmiziActionPerformed(evt);
            }
        });
        renkMenuBar.add(kirmizi);

        mavi.setText("Mavi");
        mavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maviActionPerformed(evt);
            }
        });
        renkMenuBar.add(mavi);

        pembe.setText("Pembe");
        pembe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembeActionPerformed(evt);
            }
        });
        renkMenuBar.add(pembe);

        yesil.setText("Yesil");
        yesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesilActionPerformed(evt);
            }
        });
        renkMenuBar.add(yesil);

        menuBar.add(renkMenuBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Yeni dosya oluşturma butonuna basınca çalışacak metot
    private void yeniDosyaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniDosyaMenuActionPerformed
        // Önce mevcut dosya kaydediliyor
        path = save();
        // Sonra text sıfırlanıyor
        textArea.setText("");
        // Yeni dosya henüz kaydedilmediği için false yapılıyor
        saved = false;
    }//GEN-LAST:event_yeniDosyaMenuActionPerformed

    // Dosya kaydetme butonuna basınca çalışacak metot
    private void kaydetMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetMenuActionPerformed
        // Dosya kaydediliyor
        path = save();
        // Dosyanın kaydedilip kaydedilmediğini tutan değişken true yapılıyor
        saved = true;
    }//GEN-LAST:event_kaydetMenuActionPerformed

    // Dosya açma oluşturma butonuna basınca çalışacak metot
    private void dosyaAcMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaAcMenuActionPerformed
        // Bu metotta Java'nın kendine ait dosya seçme özelliğini kullandık
        JFileChooser fc = new JFileChooser("f:"); 
  
        int savedialog = fc.showOpenDialog(null); 

        if (savedialog == JFileChooser.APPROVE_OPTION) {
            File f = new File(fc.getSelectedFile().getAbsolutePath());
            // Açılan dosyadaki metin okunuyor ve uygulamanın içindeki text kısmına yazılıyor
            try {
                String s = "", line = "";
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                line = br.readLine();
                while ((s = br.readLine()) != null) {
                    line = line + "\n" + s;
                }
                textArea.setText(line);
            } 
            catch (IOException e) { 
                JOptionPane.showMessageDialog(this, e.getMessage()); 
            }
        }
    }//GEN-LAST:event_dosyaAcMenuActionPerformed
    
    // Çıkış butonuna basınca çalışacak metot
    private void cikisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisMenuActionPerformed
        // Dosya kaydedilmemişse kaydetme ekranı açılıyor
        if(!saved) path = save();
        // Uygulamadan çıkış yapılıyor
        this.dispose();
    }//GEN-LAST:event_cikisMenuActionPerformed

    // Bulma butonuna basınca çalışacak metot
    private void bulMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulMenuActionPerformed
        // Bulma ekranı oluşturulup görünebilirliği ayarlanıyor
        find = new FindDialog();
        find.setVisible(true);
    }//GEN-LAST:event_bulMenuActionPerformed

    // Değiştirme butonuna basınca çalışacak metot
    private void degistirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirMenuActionPerformed
        // Değiştirme ekranı oluşturulup görünebilirliği ayarlanıyor
        replace = new ReplaceDialog();
        replace.setVisible(true);
    }//GEN-LAST:event_degistirMenuActionPerformed

    // Sağa hizalama butonuna basınca çalışacak metot
    private void sagaHizalaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sagaHizalaMenuActionPerformed
        // İlgili Hizala nesnesi ve hizalama metodu çağırılıp uygulanıyor
        hiza = new SagaHizala();
        hiza.hizala(textArea);
    }//GEN-LAST:event_sagaHizalaMenuActionPerformed

    // Sola hizalama butonuna basınca çalışacak metot
    private void solaHizalaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solaHizalaMenuActionPerformed
        // İlgili Hizala nesnesi ve hizalama metodu çağırılıp uygulanıyor
        hiza = new SolaHizala();
        hiza.hizala(textArea);
    }//GEN-LAST:event_solaHizalaMenuActionPerformed

    // Geri alma butonuna basınca çalışacak metot
    private void geriAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriAlMenuActionPerformed
        // Yeni UndoCommand nesnesi çağırılıp gerekli parametreler veriliyor
        undo = new UndoCommand(textArea, stack);
        // Geri alma metodu uygulanıyor
        textArea = undo.undo();
    }//GEN-LAST:event_geriAlMenuActionPerformed

    // Ortaya hizalama butonuna basınca çalışacak metot
    private void ortalaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ortalaMenuActionPerformed
        // İlgili Hizala nesnesi ve hizalama metodu çağırılıp uygulanıyor
        hiza = new OrtayaHizala();
        hiza.hizala(textArea);
    }//GEN-LAST:event_ortalaMenuActionPerformed

    // İki yana hizalama butonuna basınca çalışacak metot
    private void ikiYanaHizalaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiYanaHizalaMenuActionPerformed
        // İlgili Hizala nesnesi ve hizalama metodu çağırılıp uygulanıyor
        hiza = new IkiYanaHizala();
        hiza.hizala(textArea);
    }//GEN-LAST:event_ikiYanaHizalaMenuActionPerformed

    // Kırmızı arkaplan butonuna basınca çalışacak metot
    private void kirmiziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirmiziActionPerformed
        // Yeni Renk nesnesi oluşturuluyor ve uygun parametre veriliyor
        Renk r = rf.getRenk("kirmizi");
        // Renk değiştirecek olan metot çağırılıyor
        r.renkDegistir(textArea);
    }//GEN-LAST:event_kirmiziActionPerformed

    // Mavi arkaplan butonuna basınca çalışacak metot
    private void maviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maviActionPerformed
        // Yeni Renk nesnesi oluşturuluyor ve uygun parametre veriliyor
        Renk r = rf.getRenk("mavi");
        // Renk değiştirecek olan metot çağırılıyor
        r.renkDegistir(textArea);
    }//GEN-LAST:event_maviActionPerformed

    // Pembe arkaplan butonuna basınca çalışacak metot
    private void pembeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembeActionPerformed
        // Yeni Renk nesnesi oluşturuluyor ve uygun parametre veriliyor
        Renk r = rf.getRenk("pembe");
        // Renk değiştirecek olan metot çağırılıyor
        r.renkDegistir(textArea);
    }//GEN-LAST:event_pembeActionPerformed

    // Yeşil arkaplan butonuna basınca çalışacak metot
    private void yesilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesilActionPerformed
        // Yeni Renk nesnesi oluşturuluyor ve uygun parametre veriliyor
        Renk r = rf.getRenk("yesil");
        // Renk değiştirecek olan metot çağırılıyor
        r.renkDegistir(textArea);
    }//GEN-LAST:event_yesilActionPerformed

    // Beyaz arkaplan butonuna basınca çalışacak metot
    private void beyazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beyazActionPerformed
        // Yeni Renk nesnesi oluşturuluyor ve uygun parametre veriliyor
        Renk r = rf.getRenk("beyaz");
        // Renk değiştirecek olan metot çağırılıyor
        r.renkDegistir(textArea);
    }//GEN-LAST:event_beyazActionPerformed

    // Her harf girildikten sonra çağırılacak event
    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        // Yazılan her bir harften sonra ekrandaki metin, yığıta aktarılıyor
        stack.push(textArea.getText());
    }//GEN-LAST:event_textAreaKeyTyped

    // Dosya kaydetme metodu
    private String save() {
        JFileChooser fc = new JFileChooser("D:");
        int savedialog = fc.showSaveDialog(null);
        if(savedialog == JFileChooser.APPROVE_OPTION) {
            File f = new File(fc.getSelectedFile().getAbsolutePath());
            try {
                FileWriter wr = new FileWriter(f, false);
                try (BufferedWriter w = new BufferedWriter(wr)) {
                    w.write(textArea.getText());
                    w.flush();
                }
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            return f.getPath();
        }
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGUI().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem beyaz;
    private javax.swing.JMenu bicimMenuBar;
    private static javax.swing.JMenuItem bulMenu;
    private javax.swing.JMenuItem cikisMenu;
    private static javax.swing.JMenuItem degistirMenu;
    private static javax.swing.JMenuItem dosyaAcMenu;
    private javax.swing.JMenu dosyaMenuBar;
    private javax.swing.JMenu duzenleMenuBar;
    private javax.swing.JPanel editorPanel;
    private javax.swing.JMenuItem geriAlMenu;
    private javax.swing.JMenuItem ikiYanaHizalaMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private static javax.swing.JMenuItem kaydetMenu;
    private javax.swing.JMenuItem kirmizi;
    private javax.swing.JMenuItem mavi;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem ortalaMenu;
    private javax.swing.JMenuItem pembe;
    private javax.swing.JMenu renkMenuBar;
    private javax.swing.JMenuItem sagaHizalaMenu;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPopupMenu.Separator seperator;
    private javax.swing.JMenuItem solaHizalaMenu;
    public static javax.swing.JTextPane textArea;
    private static javax.swing.JMenuItem yeniDosyaMenu;
    private javax.swing.JMenuItem yesil;
    // End of variables declaration//GEN-END:variables
}
