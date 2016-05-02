/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.Divindade;
import model.Dominios;

/**
 *
 * @author PHAF
 */
public class TelaCadastrarDivindade extends javax.swing.JInternalFrame {

    ArrayList<Dominios> gDominios;
    
    public TelaCadastrarDivindade() {
        initComponents();
       
        gDominios = new ArrayList();
        for (Dominios lDominio : Dominios.values()) {
            modeloEsquerdo.addElement(lDominio);
        }
        
        ArrayList<Divindade> lDivindades = Divindade.carregar();
        DefaultTableModel model = (DefaultTableModel)tbDivindades.getModel();
        
        for (Divindade lDiv : lDivindades)
        {
            model.addRow(new Object[] {lDiv.getNome(), lDiv.getPoder(), lDiv.getDominios()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNivelPoder = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloEsquerdo = new DefaultListModel();
        jListEsquerdo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloDireito = new DefaultListModel();
        jListDireito = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDivindades = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Divindades");

        jLabel2.setText("Nome");

        jLabel3.setText("Nível de Poder");

        jListEsquerdo.setModel(modeloEsquerdo);
        jScrollPane1.setViewportView(jListEsquerdo);

        jListDireito.setModel(modeloDireito);
        jScrollPane2.setViewportView(jListDireito);

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaoSelecionarActionPerformed(evt);
            }
        });

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Atualizar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        tbDivindades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nível Força", "Domínios"
            }
        ));
        tbDivindades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDivindadesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDivindades);

        jLabel4.setText("Domínios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNivelPoder, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNivelPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
      
        for (Object lDominio : jListEsquerdo.getSelectedValues()) {
            modeloDireito.addElement(lDominio);
            gDominios.add((Dominios)lDominio);
        } 
       for (Dominios lDominio : gDominios) {
            modeloEsquerdo.removeElement(lDominio);
       } 
    }//GEN-LAST:event_SelecionarActionPerformed

    private void NaoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaoSelecionarActionPerformed
       for (Object lDominio : jListDireito.getSelectedValues()) {
            modeloEsquerdo.addElement(lDominio);
            gDominios.remove((Dominios)lDominio);
        }
       
       modeloDireito.removeAllElements();
       for (Dominios lDominio : gDominios) {
            modeloDireito.addElement(lDominio);
       } 
    }//GEN-LAST:event_NaoSelecionarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDivindades.getModel();
        model.addRow(new Object[] {jTextNome.getText(), Integer.parseInt(jTextNivelPoder.getText()), gDominios});
        
        //LIMPAR CAMPOS
        gDominios = new ArrayList();
        for (Dominios lDominio : Dominios.values()) {
            modeloEsquerdo.addElement(lDominio);
        }
        modeloDireito.removeAllElements();
        jTextNome.setText("");
        jTextNivelPoder.setText("");
        
        //SALVAR
       ArrayList<Divindade> lDivindades = new ArrayList();
       for (int i = 0; i < model.getRowCount(); i++)
       {
           Object Nome = model.getValueAt(i, 0);
           Object Nivel = model.getValueAt(i, 1);
           Object Dominios = model.getValueAt(i, 2);
           lDivindades.add(new Divindade(Nome.toString(), Integer.parseInt(Nivel.toString()), (ArrayList)Dominios));
       }      
       Divindade.salvar(lDivindades);
    }//GEN-LAST:event_SalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDivindades.getModel();
        model.removeRow(tbDivindades.getSelectedRow());
        
        //LIMPAR CAMPOS
        gDominios = new ArrayList();
        for (Dominios lDominio : Dominios.values()) {
            modeloEsquerdo.addElement(lDominio);
        }
        modeloDireito.removeAllElements();
        jTextNome.setText("");
        jTextNivelPoder.setText("");
        
        //SALVAR
        ArrayList<Divindade> lDivindades = new ArrayList();
       for (int i = 0; i < model.getRowCount(); i++)
       {
           Object Nome = model.getValueAt(i, 0);
           Object Nivel = model.getValueAt(i, 1);
           Object Dominios = model.getValueAt(i, 2);
           lDivindades.add(new Divindade(Nome.toString(), Integer.parseInt(Nivel.toString()), (ArrayList)Dominios));
       }      
       Divindade.salvar(lDivindades);
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDivindades.getModel();
        model.setValueAt(jTextNome.getText(), tbDivindades.getSelectedRow(), 0);
        model.setValueAt(Integer.parseInt(jTextNivelPoder.getText()), tbDivindades.getSelectedRow(), 1);
        model.setValueAt(gDominios, tbDivindades.getSelectedRow(), 2);     
        
        //LIMPAR CAMPOS
        gDominios = new ArrayList();
        for (Dominios lDominio : Dominios.values()) {
            modeloEsquerdo.addElement(lDominio);
        }
        modeloDireito.removeAllElements();
        jTextNome.setText("");
        jTextNivelPoder.setText("");
        
        //SALVAR
        ArrayList<Divindade> lDivindades = new ArrayList();
       for (int i = 0; i < model.getRowCount(); i++)
       {
           Object Nome = model.getValueAt(i, 0);
           Object Nivel = model.getValueAt(i, 1);
           Object Dominios = model.getValueAt(i, 2);
           lDivindades.add(new Divindade(Nome.toString(), Integer.parseInt(Nivel.toString()), (ArrayList)Dominios));
       }      
       Divindade.salvar(lDivindades);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void tbDivindadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDivindadesMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbDivindades.getModel();
        jTextNome.setText(model.getValueAt(tbDivindades.getSelectedRow(), 0).toString());
        jTextNivelPoder.setText(model.getValueAt(tbDivindades.getSelectedRow(), 1).toString());
        
        Object lDominios = model.getValueAt(tbDivindades.getSelectedRow(), 2);
        gDominios.clear();
        modeloDireito.removeAllElements();
        for (Object ld : (ArrayList)lDominios)
        {
            modeloDireito.addElement(ld);
            gDominios.add((Dominios)ld);
        }
        for (Dominios lDominio : gDominios) {
            modeloEsquerdo.removeElement(lDominio);
       }      
    }//GEN-LAST:event_tbDivindadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListDireito;
    private DefaultListModel modeloDireito;
    private javax.swing.JList<String> jListEsquerdo;
    private DefaultListModel modeloEsquerdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextNivelPoder;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTable tbDivindades;
    // End of variables declaration//GEN-END:variables
}
