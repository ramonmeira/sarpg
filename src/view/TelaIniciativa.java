/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Campanha;
import controller.PersonagemNaCampanha;
import controller.Sistema;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;

/**
 *
 * @author PHAF
 */
public class TelaIniciativa extends javax.swing.JInternalFrame {

    public List<PersonagemNaCampanha> gPersonagens;
    public List<Campanha> gCampanhas;
    private int gi_campanha;
            
    public TelaIniciativa() {
        initComponents();
        
        gCampanhas = Sistema.getInstance().getCampanha();
        
        for (Campanha lCampanha : gCampanhas) {
            jComboBoxCampanha.addItem(lCampanha.getDescrição());
        }
        gi_campanha = 0;
        atualizaModelo();
    }
    
    private void atualizaModelo(){
        int iniciativa;
        modelo.removeAllElements();
        gPersonagens = gCampanhas.get(gi_campanha).getPersonagem();
        for (PersonagemNaCampanha p: gPersonagens) {            
            iniciativa = p.getIniciativa();
            modelo.addElement("(" + (iniciativa<10 ? (iniciativa<0 ? "" : "0") : "") + iniciativa+ ") "+p.getPersonagem().getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBoxCampanha = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jListPersonagens = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Iniciativa");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setText("Gerar Iniciativa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarIniciativa(evt);
            }
        });

        jComboBoxCampanha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCampanhaItemStateChanged(evt);
            }
        });

        jListPersonagens.setModel(modelo);
        jListPersonagens.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPersonagensValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListPersonagens);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/image/up.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarAcima(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/image/down.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarAbaixo(evt);
            }
        });

        jLabel1.setText("Campanha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBoxCampanha.getAccessibleContext().setAccessibleName("jComboBox1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerarIniciativa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarIniciativa
        Random lGerador = new Random();
        if(jComboBoxCampanha.getSelectedIndex()>-1){
            gi_campanha = jComboBoxCampanha.getSelectedIndex();
            Campanha lCampanha = gCampanhas.get(gi_campanha);

            for (PersonagemNaCampanha p: lCampanha.getPersonagem()){
                p.setIniciativa((p.getPersonagem().getDestreza()-10)/2+lGerador.nextInt(20)+1);                        
            }
            gPersonagens = lCampanha.getPersonagem();

            Collections.sort (gPersonagens, new Comparator() {
                public int compare(Object o1, Object o2) {
                    PersonagemNaCampanha p1 = (PersonagemNaCampanha) o1;
                    PersonagemNaCampanha p2 = (PersonagemNaCampanha) o2;
                    int iniciativa1 = p1.getIniciativa();
                    int iniciativa2 = p2.getIniciativa();
                    return iniciativa1< iniciativa2? +1 : (iniciativa1> iniciativa2? -1 : (p1.getPersonagem().getDestreza() > p2.getPersonagem().getDestreza() ? +1 :0 ));
                }
            });

            atualizaModelo();
        }
        
    }//GEN-LAST:event_GerarIniciativa
    
    private void OrdenarAcima(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarAcima
        
        int lIndex = jListPersonagens.getSelectedIndex();
        
        if (lIndex == 0)
            return;
        System.out.println("view.TelaIniciativa.OrdenarAcima()"+lIndex);
        PersonagemNaCampanha tmp1 = gPersonagens.get(lIndex);
        PersonagemNaCampanha tmp2 = gPersonagens.get(lIndex - 1);
        
        gPersonagens.set(lIndex - 1, tmp1);
        gPersonagens.set(lIndex, tmp2);
        
        atualizaModelo();
        jListPersonagens.setSelectedIndex(lIndex-1);
    }//GEN-LAST:event_OrdenarAcima

    private void OrdenarAbaixo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarAbaixo
        int lIndex = jListPersonagens.getSelectedIndex();
        
        if (lIndex == gPersonagens.size() - 1)
            return;
        
        PersonagemNaCampanha tmp1 = gPersonagens.get(lIndex);
        PersonagemNaCampanha tmp2 = gPersonagens.get(lIndex + 1);
        
        gPersonagens.set(lIndex + 1, tmp1);
        gPersonagens.set(lIndex, tmp2);
        
        atualizaModelo();
        
        jListPersonagens.setSelectedIndex(lIndex+1);        
    }//GEN-LAST:event_OrdenarAbaixo

    private void jListPersonagensValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPersonagensValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListPersonagensValueChanged

    private void jComboBoxCampanhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCampanhaItemStateChanged
        gi_campanha = jComboBoxCampanha.getSelectedIndex();
        atualizaModelo();
    }//GEN-LAST:event_jComboBoxCampanhaItemStateChanged

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Sistema.salvar(Sistema.EnumObjeto.CAMPANHA);
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxCampanha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListPersonagens;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
