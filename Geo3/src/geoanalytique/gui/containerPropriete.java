package geoanalytique.gui;

import javax.swing.*;



@SuppressWarnings("serial")
public class containerPropriete extends JPanel{

	/**
	 * 
	 */

	public containerPropriete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        jscrolChamp = new JScrollPane();
        jtableChamp = new JTable();
        annulerBtn = new JButton();
        validerBtn = new JButton();
        annulerBtn.setText("Annuler");
        validerBtn.setText("Valider");


        javax.swing.GroupLayout panelProprieteContainerLayout = new javax.swing.GroupLayout(this);
        this.setLayout(panelProprieteContainerLayout);
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


    }

    public JButton annulerBtn;
    public JScrollPane jscrolChamp;
    public JTable jtableChamp;
    public JButton validerBtn;
    public Object data[][];
    public String tilte[];
}
