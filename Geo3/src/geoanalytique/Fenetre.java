/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geoanalytique;

/**
 *
 * @author virtuel
 */
public class Fenetre extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
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

        jPanel1 = new javax.swing.JPanel();
        FenContainer = new javax.swing.JPanel();
        PanelOutil = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelGraphiq = new javax.swing.JPanel();
        PanelBobdi = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FenContainer.setBackground(new java.awt.Color(0, 204, 255));
        FenContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelOutil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelOutil.setMaximumSize(new java.awt.Dimension(100, 333));
        PanelOutil.setPreferredSize(new java.awt.Dimension(4, 4));
        PanelOutil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                PanelOutilComponentResized(evt);
            }
        });

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout PanelOutilLayout = new javax.swing.GroupLayout(PanelOutil);
        PanelOutil.setLayout(PanelOutilLayout);
        PanelOutilLayout.setHorizontalGroup(
            PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOutilLayout.createSequentialGroup()
                .addGroup(PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOutilLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addGroup(PanelOutilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelOutilLayout.setVerticalGroup(
            PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOutilLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        PanelGraphiq.setBackground(new java.awt.Color(204, 204, 204));
        PanelGraphiq.setBorder(javax.swing.BorderFactory.createTitledBorder("Zone de Dessin"));

        PanelBobdi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelBobdiLayout = new javax.swing.GroupLayout(PanelBobdi);
        PanelBobdi.setLayout(PanelBobdiLayout);
        PanelBobdiLayout.setHorizontalGroup(
            PanelBobdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        PanelBobdiLayout.setVerticalGroup(
            PanelBobdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelGraphiqLayout = new javax.swing.GroupLayout(PanelGraphiq);
        PanelGraphiq.setLayout(PanelGraphiqLayout);
        PanelGraphiqLayout.setHorizontalGroup(
            PanelGraphiqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGraphiqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBobdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelGraphiqLayout.setVerticalGroup(
            PanelGraphiqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGraphiqLayout.createSequentialGroup()
                .addComponent(PanelBobdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FenContainerLayout = new javax.swing.GroupLayout(FenContainer);
        FenContainer.setLayout(FenContainerLayout);
        FenContainerLayout.setHorizontalGroup(
            FenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FenContainerLayout.createSequentialGroup()
                .addComponent(PanelOutil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGraphiq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FenContainerLayout.setVerticalGroup(
            FenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOutil, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelGraphiq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(FenContainer, java.awt.BorderLayout.CENTER);

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aide");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelOutilComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PanelOutilComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelOutilComponentResized

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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FenContainer;
    private javax.swing.JPanel PanelBobdi;
    private javax.swing.JPanel PanelGraphiq;
    private javax.swing.JPanel PanelOutil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
