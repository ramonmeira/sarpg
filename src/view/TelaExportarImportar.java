/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Personagem;
import model.Arquivo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import controller.Sistema;

/**
 *
 * @author Ramon
 */
public class TelaExportarImportar extends javax.swing.JInternalFrame {
    private boolean EXPORTAR, PDF;
    private ArrayList<Personagem> personagens;
        
    public TelaExportarImportar(Boolean exportar, Boolean pdf) {
        initComponents();
        EXPORTAR = exportar;
        PDF = pdf;
        if(EXPORTAR){
            if(PDF){
                setTitle("Exportar Personagem para PDF");
                jLNivel.setVisible(true);
                jTNível.setVisible(true);
            }
            else{
                setTitle("Exportar Personagem");
                jLNivel.setVisible(false);
                jTNível.setVisible(false);
            }
            
            jCBPersonagem.setVisible(true);
            personagens = Sistema.getInstance().getPersonagem();
            
            if(personagens != null){
                for (Personagem pers : personagens) {
                    jCBPersonagem.addItem(pers.getNome());
                }            
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existem personagens no sistema", "Sem personagens", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            setTitle("Importar Personagem");
            jCBPersonagem.setVisible(false);
            jLPersonagem.setVisible(false);
            jTNível.setVisible(false);
            jLNivel.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jTCaminho = new javax.swing.JTextField();
        jBConfirmar = new javax.swing.JButton();
        jBCaminho = new javax.swing.JButton();
        jCBPersonagem = new javax.swing.JComboBox<>();
        jTNível = new javax.swing.JTextField();
        jLNivel = new javax.swing.JLabel();
        jLPersonagem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Importar Personagem");

        jTCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCaminhoActionPerformed(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBCaminho.setText("...");
        jBCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCaminhoActionPerformed(evt);
            }
        });

        jLNivel.setText("Nível");

        jLPersonagem.setText("Personagem");

        jLabel3.setText("Caminho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPersonagem)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCBPersonagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNível, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBConfirmar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCaminho)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmar)
                    .addComponent(jCBPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNível, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNivel)
                    .addComponent(jLPersonagem))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        if(EXPORTAR){
            Personagem personagem = personagens.get(jCBPersonagem.getSelectedIndex());
            if(PDF){
                if(jTNível.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha o campo de nível", "Campo de nível vazio", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else
                    personagem.GerarPDF(jTCaminho.getText(),Integer.parseInt(jTNível.getText()));
            }
            else{
                try {
                    Arquivo.exportar(personagem.toString(), jTCaminho.getText());
                } catch (IOException ex) {
                    Logger.getLogger(TelaExportarImportar.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Personagem não exportado", "Falha", JOptionPane.ERROR_MESSAGE );
                    return;
                }                
            }
            JOptionPane.showMessageDialog(null, "Personagem exportado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE );            
        }
        else{
            try {
                System.out.println("view.TelaExportarImportar.jBConfirmarActionPerformed()"+Arquivo.ler(jTCaminho.getText()));
                Sistema.getInstance().getPersonagem().addAll(Personagem.toObjeto(Arquivo.ler(jTCaminho.getText())));
                Sistema.salvar(Sistema.EnumObjeto.PERSONAGEM);
            } catch (IOException ex) {
                Logger.getLogger(TelaExportarImportar.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Personagem não importado", "Falha", JOptionPane.ERROR_MESSAGE );
            }
            TelaCadastrarPersonagem tela = new TelaCadastrarPersonagem((Personagem)Sistema.getInstance().getPersonagem().get(Sistema.getInstance().getPersonagem().size()-1));
            this.getParent().add(tela);
            tela.setVisible(true);
            tela.setClosable(true);
        }
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCaminhoActionPerformed
        int returnVal = 0;
        if(EXPORTAR) returnVal = fileChooser.showSaveDialog(this);
        else         returnVal = fileChooser.showOpenDialog(this);        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            jTCaminho.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jBCaminhoActionPerformed

    private void jTCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCaminhoActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jBCaminho;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JComboBox<String> jCBPersonagem;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLPersonagem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTCaminho;
    private javax.swing.JTextField jTNível;
    // End of variables declaration//GEN-END:variables
}
