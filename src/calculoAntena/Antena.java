/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoAntena;

/**
 *
 * @author alumno
 */
public class Antena extends javax.swing.JFrame {

    /**
     * Creates new form Antena
     */
    public Antena() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPosicion = new javax.swing.JPanel();
        jLabelOrientacion = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldOrientacion = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jCheckBoxBordeInferior = new javax.swing.JCheckBox();
        jPanelSistema = new javax.swing.JPanel();
        jComboBoxTipoAntena = new javax.swing.JComboBox<>();
        jButtonAjustarCanalesWatios = new javax.swing.JButton();
        jButtonAjustarToleranciaA = new javax.swing.JButton();
        jComboBoxPolarizacion = new javax.swing.JComboBox<>();
        jButtonAjustarRangoHasta = new javax.swing.JButton();
        jTextFieldWatios = new javax.swing.JTextField();
        jLabelWatios = new javax.swing.JLabel();
        jLabelCanales = new javax.swing.JLabel();
        jTextFieldCanales = new javax.swing.JTextField();
        jLabelTipoAntena = new javax.swing.JLabel();
        jLabelPolarizacion = new javax.swing.JLabel();
        jLabelTolerancia = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldTolerancia = new javax.swing.JTextField();
        jLabelA = new javax.swing.JLabel();
        jLabelRango = new javax.swing.JLabel();
        jTextFieldHasta = new javax.swing.JTextField();
        jTextFieldDesde = new javax.swing.JTextField();
        jLabelHasta = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPosicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Posición/Orientación"));

        jLabelOrientacion.setText("Orientación [º]:");

        jLabelAltura.setText("Altura [m]:");

        jTextFieldOrientacion.setText("140.00");

        jTextFieldAltura.setText("110.00");

        jCheckBoxBordeInferior.setText("Altura desde el borde inferior");

        javax.swing.GroupLayout jPanelPosicionLayout = new javax.swing.GroupLayout(jPanelPosicion);
        jPanelPosicion.setLayout(jPanelPosicionLayout);
        jPanelPosicionLayout.setHorizontalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAltura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelOrientacion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPosicionLayout.createSequentialGroup()
                        .addComponent(jCheckBoxBordeInferior)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldOrientacion)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelPosicionLayout.setVerticalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrientacion)
                    .addComponent(jTextFieldOrientacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAltura)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxBordeInferior)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema"));

        jComboBoxTipoAntena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kathrein 742151", "Kathrein 856543", "Kathrein 962151" }));
        jComboBoxTipoAntena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoAntenaActionPerformed(evt);
            }
        });

        jButtonAjustarCanalesWatios.setText("Ajustar");

        jButtonAjustarToleranciaA.setText("Ajustar");

        jComboBoxPolarizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X +45", "X +50", "X +55", "X +60" }));
        jComboBoxPolarizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPolarizacionActionPerformed(evt);
            }
        });

        jButtonAjustarRangoHasta.setText("Ajustar");

        jTextFieldWatios.setText("12.000");

        jLabelWatios.setText("Watios");

        jLabelCanales.setText("Canales");

        jTextFieldCanales.setText("2");

        jLabelTipoAntena.setText("Tipo Antena");

        jLabelPolarizacion.setText("Polarización:");

        jLabelTolerancia.setText("Tolerancia Electrica de [º]:");

        jTextFieldA.setText("10.000");

        jTextFieldTolerancia.setText("0.000");

        jLabelA.setText("A:");

        jLabelRango.setText("Rango Frecuencia [MHz] de:");

        jTextFieldHasta.setText("951.000");

        jTextFieldDesde.setText("943.000");

        jLabelHasta.setText("Hasta:");

        javax.swing.GroupLayout jPanelSistemaLayout = new javax.swing.GroupLayout(jPanelSistema);
        jPanelSistema.setLayout(jPanelSistemaLayout);
        jPanelSistemaLayout.setHorizontalGroup(
            jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSistemaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelTolerancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabelA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAjustarToleranciaA))
                    .addGroup(jPanelSistemaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSistemaLayout.createSequentialGroup()
                                .addComponent(jLabelTipoAntena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoAntena, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSistemaLayout.createSequentialGroup()
                                .addComponent(jLabelCanales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCanales, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWatios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldWatios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAjustarCanalesWatios))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSistemaLayout.createSequentialGroup()
                                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPolarizacion)
                                    .addComponent(jLabelRango))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelSistemaLayout.createSequentialGroup()
                                        .addComponent(jTextFieldDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelHasta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAjustarRangoHasta))
                                    .addComponent(jComboBoxPolarizacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanelSistemaLayout.setVerticalGroup(
            jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSistemaLayout.createSequentialGroup()
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjustarCanalesWatios)
                    .addComponent(jTextFieldWatios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelWatios)
                    .addComponent(jTextFieldCanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCanales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoAntena, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoAntena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjustarToleranciaA)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA)
                    .addComponent(jTextFieldTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTolerancia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPolarizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPolarizacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjustarRangoHasta)
                    .addComponent(jTextFieldHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHasta)
                    .addComponent(jTextFieldDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRango))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jButtonCancelar.setText("Cancelar");

        jButtonOK.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap())
            .addComponent(jPanelPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonOK)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPolarizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPolarizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPolarizacionActionPerformed

    private void jComboBoxTipoAntenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoAntenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoAntenaActionPerformed

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
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Antena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjustarCanalesWatios;
    private javax.swing.JButton jButtonAjustarRangoHasta;
    private javax.swing.JButton jButtonAjustarToleranciaA;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxBordeInferior;
    private javax.swing.JComboBox<String> jComboBoxPolarizacion;
    private javax.swing.JComboBox<String> jComboBoxTipoAntena;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelCanales;
    private javax.swing.JLabel jLabelHasta;
    private javax.swing.JLabel jLabelOrientacion;
    private javax.swing.JLabel jLabelPolarizacion;
    private javax.swing.JLabel jLabelRango;
    private javax.swing.JLabel jLabelTipoAntena;
    private javax.swing.JLabel jLabelTolerancia;
    private javax.swing.JLabel jLabelWatios;
    private javax.swing.JPanel jPanelPosicion;
    private javax.swing.JPanel jPanelSistema;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCanales;
    private javax.swing.JTextField jTextFieldDesde;
    private javax.swing.JTextField jTextFieldHasta;
    private javax.swing.JTextField jTextFieldOrientacion;
    private javax.swing.JTextField jTextFieldTolerancia;
    private javax.swing.JTextField jTextFieldWatios;
    // End of variables declaration//GEN-END:variables
}
