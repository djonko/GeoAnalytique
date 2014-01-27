/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geoanalytique;

/**
 *
 * @author virtuel
 */
public class Propriete extends javax.swing.JPanel {

    public Propriete() {
        initComponents();
    }



    private void initComponents() {

        panelProprieteContainer = new javax.swing.JPanel();
        jscrolChamp = new javax.swing.JScrollPane();
        jtableChamp = new javax.swing.JTable();
        annulerBtn = new javax.swing.JButton();
        validerBtn = new javax.swing.JButton();

        jtableChamp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"nom", null},
                {"Point1", null},
                {"Point2", null},
                {"Point3", null},
                {"Point4", null}
            },
            new String [] {
                "champs", "Valeurs"
            }
        ));
        jscrolChamp.setViewportView(jtableChamp);

        annulerBtn.setText("Annuler");
        annulerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBtnActionPerformed(evt);
            }
        });

        validerBtn.setText("Valider");
        validerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProprieteContainerLayout = new javax.swing.GroupLayout(panelProprieteContainer);
        panelProprieteContainer.setLayout(panelProprieteContainerLayout);
        panelProprieteContainerLayout.setHorizontalGroup(
            panelProprieteContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProprieteContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProprieteContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProprieteContainerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(annulerBtn)
                        .addGap(18, 18, 18)
                        .addComponent(validerBtn))
                    .addComponent(jscrolChamp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelProprieteContainerLayout.setVerticalGroup(
            panelProprieteContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProprieteContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jscrolChamp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProprieteContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerBtn)
                    .addComponent(validerBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProprieteContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProprieteContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }

    private void validerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerBtnActionPerformed
        // TODO add your handling code here:
    }

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
        // TODO add your handling code here:
    }

   
    private javax.swing.JButton annulerBtn;
    private javax.swing.JScrollPane jscrolChamp;
    private javax.swing.JTable jtableChamp;
    private javax.swing.JPanel panelProprieteContainer;
    private javax.swing.JButton validerBtn;

}
