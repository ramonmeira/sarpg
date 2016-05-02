/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import model.*;

/**
 *
 * @author PHAF
 */
public class TelaIniciativa extends javax.swing.JInternalFrame {

    public List<Personagem> gPersonagens;
    public List<Campanha> gCampanhas;
            
    public TelaIniciativa() {
        initComponents();
        
        gCampanhas = Campanha.carregar();
        
        modelo.removeAllElements();
        for (Campanha lCampanha : gCampanhas) {
            jComboBoxCampanha.addItem(lCampanha.getDescrição());
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

        jButton1.setText("Gerar Iniciativa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarIniciativa(evt);
            }
        });

        jListPersonagens.setModel(modelo);
        jScrollPane2.setViewportView(jListPersonagens);

        jButton3.setText("^");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarAcima(evt);
            }
        });

        jButton4.setText("v");
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBoxCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(93, 93, 93))))
        );

        jComboBoxCampanha.getAccessibleContext().setAccessibleName("jComboBox1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerarIniciativa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarIniciativa
        Random lGerador = new Random();
        
        Campanha lCampanha = gCampanhas.get(jComboBoxCampanha.getSelectedIndex());
        
        gPersonagens = new ArrayList();
        gPersonagens.addAll(lCampanha.getPersonagem());
                
        for (Personagem p: gPersonagens) 
        {
            p.setForça((p.getDestreza()-10)/2+lGerador.nextInt(20)+1); 
            System.out.println("view.TelaIniciativa.GerarIniciativa()"+p.getDestreza()+"  "+p.getForca());
        }
                
        Collections.sort (gPersonagens, new Comparator() {
            public int compare(Object o1, Object o2) {
                Personagem p1 = (Personagem) o1;
                Personagem p2 = (Personagem) o2;
                return p1.getForca()< p2.getForca()? +1 : (p1.getForca()> p2.getForca()? -1 : (p1.getDestreza() > p2.getDestreza() ? +1 :0 ));
            }
        });
        
        modelo.removeAllElements();
        for (Personagem lP : gPersonagens) {
            modelo.addElement("(" + (lP.getForca()<10 ? "0":"") + Integer.toString(lP.getForca())+ ") "+lP.getNome());
        }
        
    }//GEN-LAST:event_GerarIniciativa
    
    private void OrdenarAcima(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarAcima
        
        int lIndex = jListPersonagens.getSelectedIndex();
        
        if (lIndex == 0)
            return;
        
        Personagem tmp1 = gPersonagens.get(lIndex);
        Personagem tmp2 = gPersonagens.get(lIndex - 1);
        
        gPersonagens.set(lIndex - 1, tmp1);
        gPersonagens.set(lIndex, tmp2);
        
        modelo.removeAllElements();
        for (Personagem lP : gPersonagens) {
            modelo.addElement("(" + (lP.getForca()<10 ? "0":"") + Integer.toString(lP.getForca())+ ") "+lP.getNome());
        }
    }//GEN-LAST:event_OrdenarAcima

    private void OrdenarAbaixo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarAbaixo
        int lIndex = jListPersonagens.getSelectedIndex();
        
        if (lIndex == gPersonagens.size() - 1)
            return;
        
        Personagem tmp1 = gPersonagens.get(lIndex);
        Personagem tmp2 = gPersonagens.get(lIndex + 1);
        
        gPersonagens.set(lIndex + 1, tmp1);
        gPersonagens.set(lIndex, tmp2);
        
        modelo.removeAllElements();
        for (Personagem lP : gPersonagens) {
             modelo.addElement("(" + (lP.getForca()<10 ? "0":"") + Integer.toString(lP.getForca())+ ") "+lP.getNome());
        }
    }//GEN-LAST:event_OrdenarAbaixo

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
