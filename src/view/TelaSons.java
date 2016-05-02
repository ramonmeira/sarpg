/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ItemEvent;
import java.net.URL;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import sons.*;
/**
 *
 * @author Ramon
 */
public class TelaSons extends javax.swing.JInternalFrame {
    private AudioClip audio = null;
    private boolean loop = false;
            
    public TelaSons() {
        initComponents();
    }
    public void play(String nome){        
	URL url = Som.class.getResource(nome+".wav");
        if(audio!=null) audio.stop();
	audio = Applet.newAudioClip(url);
        if(loop)
            audio.loop();
        else    
            audio.play();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBLoop = new javax.swing.JToggleButton();
        jBLobos = new javax.swing.JButton();
        jBChuva = new javax.swing.JButton();
        jBespadas = new javax.swing.JButton();
        jBCavalo = new javax.swing.JButton();
        jBVento = new javax.swing.JButton();
        jBPorta = new javax.swing.JButton();

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

        jTBLoop.setText("Loop");
        jTBLoop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTBLoopItemStateChanged(evt);
            }
        });

        jBLobos.setText("Lobos");
        jBLobos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLobosActionPerformed(evt);
            }
        });

        jBChuva.setText("Chuva");
        jBChuva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChuvaActionPerformed(evt);
            }
        });

        jBespadas.setText("Espadas");
        jBespadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBespadasActionPerformed(evt);
            }
        });

        jBCavalo.setText("Cavalo");
        jBCavalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCavaloActionPerformed(evt);
            }
        });

        jBVento.setText("Vento");
        jBVento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVentoActionPerformed(evt);
            }
        });

        jBPorta.setText("Porta");
        jBPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPortaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBLoop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLobos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBChuva, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBespadas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCavalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBVento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBPorta)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCavalo, jBChuva, jBLobos, jBPorta, jBVento, jBespadas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBLoop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLobos)
                    .addComponent(jBChuva)
                    .addComponent(jBespadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCavalo)
                    .addComponent(jBVento)
                    .addComponent(jBPorta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        audio.stop();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jTBLoopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTBLoopItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            loop = true;
            if(audio!=null)
                audio.loop();
        } else if(evt.getStateChange()==ItemEvent.DESELECTED){
            loop = false;
            if(audio!=null)
                audio.stop();
        }
    }//GEN-LAST:event_jTBLoopItemStateChanged

    private void jBLobosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLobosActionPerformed
        play("Lobos_uivando");
    }//GEN-LAST:event_jBLobosActionPerformed

    private void jBChuvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChuvaActionPerformed
        play("Chuva");
    }//GEN-LAST:event_jBChuvaActionPerformed

    private void jBespadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBespadasActionPerformed
        play("Espadas");
    }//GEN-LAST:event_jBespadasActionPerformed

    private void jBCavaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCavaloActionPerformed
        play("Cavalo");
    }//GEN-LAST:event_jBCavaloActionPerformed

    private void jBVentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVentoActionPerformed
        play("Vento");
    }//GEN-LAST:event_jBVentoActionPerformed

    private void jBPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPortaActionPerformed
        play("Porta");
    }//GEN-LAST:event_jBPortaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCavalo;
    private javax.swing.JButton jBChuva;
    private javax.swing.JButton jBLobos;
    private javax.swing.JButton jBPorta;
    private javax.swing.JButton jBVento;
    private javax.swing.JButton jBespadas;
    private javax.swing.JToggleButton jTBLoop;
    // End of variables declaration//GEN-END:variables
}
