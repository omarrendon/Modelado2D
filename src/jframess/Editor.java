/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframess;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Luis
 */
public class Editor extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        encender = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        tam2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tam1 = new javax.swing.JComboBox<>();
        jCBFormato = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        IFcamara = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido a la Camara Web");

        encender.setText("Encender camara");
        encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encenderActionPerformed(evt);
            }
        });

        apagar.setText("Apagar camara");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        tam2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        tam2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "144", "240", "480"}));
        tam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arabic Typesetting", 3, 24)); // NOI18N
        jButton3.setText("Tomar foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 0, 24)); // NOI18N
        jLabel2.setText("Seleccione el formato: ");

        tam1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        tam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "176", "320", "640"}));
        tam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam1ActionPerformed(evt);
            }
        });

        jCBFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JPG", "GIF", "PNG", "BMP" }));
        jCBFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFormatoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        jLabel3.setText("Seleccione el tamaño: ");

        IFcamara.setVisible(true);

        javax.swing.GroupLayout IFcamaraLayout = new javax.swing.GroupLayout(IFcamara.getContentPane());
        IFcamara.getContentPane().setLayout(IFcamaraLayout);
        IFcamaraLayout.setHorizontalGroup(
            IFcamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        IFcamaraLayout.setVerticalGroup(
            IFcamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Bradley Hand ITC", 0, 24)); // NOI18N
        jLabel4.setText("Nombre de foto:");

        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jButton1.setText("Desea Editar colores??");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IFcamara)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(encender))
                                        .addGap(88, 88, 88))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCBFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tam1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tam2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56))
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(encender)
                        .addGap(32, 32, 32)
                        .addComponent(apagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tam2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IFcamara))
                .addContainerGap())
        );

        //IFcamara.add(webcamPanel);
        //          IFcamara.pack();
        //          IFcamara.setVisible(true);
        //          IFcamara.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encenderActionPerformed
        // TODO add your handling code here:

        webcam = Webcam.getDefault();
//        webcam.setViewSize(WebcamResolution.VGA.getSize());
/////////////////////////////////////////
        if (tam1.getSelectedIndex() == 0) {
            webcam.setViewSize(new Dimension(176, 144));
        }
        if (tam1.getSelectedIndex() == 1) {
            webcam.setViewSize(new Dimension(320, 240));
        }
        if (tam1.getSelectedIndex() == 2) {
            webcam.setViewSize(new Dimension(640, 480));
        }
        /////////////////////////////////////////
        webcam.open();
        webcamPanel = new WebcamPanel(webcam);
        webcamPanel.setImageSizeDisplayed(true);
//            webcamPanel.setFPSDisplayed(true);
        IFcamara.setContentPane(webcamPanel);
        IFcamara.setResizable(false);
        IFcamara.add(webcamPanel);//tal vez
        IFcamara.pack();
        IFcamara.setVisible(true);
        IFcamara.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        System.out.println("Ya estuvo");

    }//GEN-LAST:event_encenderActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:

        webcam.close();
        System.out.println("Ya se apago");

    }//GEN-LAST:event_apagarActionPerformed

    private void tam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam1ActionPerformed
        // TODO add your handling code here:
        if (tam1.getSelectedIndex() == 0) {
            tam2.setSelectedIndex(0);
//            webcam.setViewSize(new Dimension(176,144));

        }
        if (tam1.getSelectedIndex() == 1) {
            tam2.setSelectedIndex(1);
//             webcam.setViewSize(new Dimension(320,240));
        }
        if (tam1.getSelectedIndex() == 2) {
            tam2.setSelectedIndex(2);
//             webcam.setViewSize(new Dimension(640,480));
        }
    }//GEN-LAST:event_tam1ActionPerformed

    private void jCBFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFormatoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            ImageIO.write(webcam.getImage(), "" + jCBFormato.getSelectedItem().toString().toUpperCase(), new File("" + jtfNombre.getText() + "." + jCBFormato.getSelectedItem().toString().toLowerCase()));
            System.out.println("" + tam1.getSelectedItem().toString());
            for (Dimension supportedSize : webcam.getViewSizes()) {
                System.out.println("Dimension:  " + supportedSize.toString());
            }
//Dimension:  java.awt.Dimension[width=176,height=144]
//Dimension:  java.awt.Dimension[width=320,height=240]
//Dimension:  java.awt.Dimension[width=640,height=480]
        } catch (IOException ex) {
//            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hay problemas para escribir");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam2ActionPerformed
        // TODO add your handling code here:
        if (tam2.getSelectedIndex() == 0) {
            tam1.setSelectedIndex(0);
        }
        if (tam2.getSelectedIndex() == 1) {
            tam1.setSelectedIndex(1);
        }
        if (tam2.getSelectedIndex() == 2) {
            tam1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tam2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        String nombreCompleto = ""+jtfNombre.getText();
        String formato = jCBFormato.getSelectedItem().toString().toLowerCase();
        EditorPixel editor = new EditorPixel(nombreCompleto,formato);
        editor.setVisible(true);
//        System.out.println("Algo anda mal");
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
    //MAS VARIABLES
    Webcam webcam;
    WebcamPanel webcamPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame IFcamara;
    private javax.swing.JButton apagar;
    private javax.swing.JButton encender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JComboBox<String> tam1;
    private javax.swing.JComboBox<String> tam2;
    // End of variables declaration//GEN-END:variables
}