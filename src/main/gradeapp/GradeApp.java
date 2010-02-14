/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GradeApp.java
 *
 * Created on Feb 9, 2010, 1:49:26 PM
 */

package gradeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Sandro Badame <a href="mailto:s.badame@gmail.com">s.badame&amp;gmail.com</a>
 */
public class GradeApp extends javax.swing.JFrame {

    /** Creates new form GradeApp */
    public GradeApp() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadButton = new javax.swing.JButton();
        emailButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        goodGradePanel = new javax.swing.JPanel();
        gradeSlider = new javax.swing.JSlider();
        noiseSliderPanel = new javax.swing.JPanel();
        noiseSlider = new javax.swing.JSlider();
        graphPanel = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadButton.setText("Load *.xls");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        emailButton.setText("Email");
        emailButton.setEnabled(false);

        printButton.setText("Print");
        printButton.setEnabled(false);

        goodGradePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Good Grade - " + Graph.DEFAULT_GOODGRADE));

        gradeSlider.setPaintLabels(true);
        gradeSlider.setValue((int)(Graph.DEFAULT_GOODGRADE));
        gradeSlider.setEnabled(false);
        gradeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gradeSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout goodGradePanelLayout = new javax.swing.GroupLayout(goodGradePanel);
        goodGradePanel.setLayout(goodGradePanelLayout);
        goodGradePanelLayout.setHorizontalGroup(
            goodGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goodGradePanelLayout.createSequentialGroup()
                .addComponent(gradeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap())
        );
        goodGradePanelLayout.setVerticalGroup(
            goodGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goodGradePanelLayout.createSequentialGroup()
                .addComponent(gradeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        noiseSliderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Noise - " + Graph.DEFAULT_NOISE));

        noiseSlider.setValue((int)(Graph.DEFAULT_NOISE*100));
        noiseSlider.setEnabled(false);
        noiseSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noiseSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout noiseSliderPanelLayout = new javax.swing.GroupLayout(noiseSliderPanel);
        noiseSliderPanel.setLayout(noiseSliderPanelLayout);
        noiseSliderPanelLayout.setHorizontalGroup(
            noiseSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseSliderPanelLayout.createSequentialGroup()
                .addComponent(noiseSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap())
        );
        noiseSliderPanelLayout.setVerticalGroup(
            noiseSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseSliderPanelLayout.createSequentialGroup()
                .addComponent(noiseSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        helpButton.setText("Help!");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graphPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noiseSliderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goodGradePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                        .addComponent(helpButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(emailButton)
                    .addComponent(printButton)
                    .addComponent(helpButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goodGradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noiseSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        File input = fc.getSelectedFile();
        try {
            Graph.createGraph(input);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GraphFormatException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        emailButton.setEnabled(true);
        saveButton.setEnabled(true);
        printButton.setEnabled(true);
        noiseSlider.setEnabled(true);
        gradeSlider.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_loadButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        HelpShower.showHelp();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void gradeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gradeSliderStateChanged

        Graph.getGraph().setGoodgrade(gradeSlider.getValue());   // TODO add your handling code here:
        String title = "Good Grade - ";
        ((TitledBorder)goodGradePanel.getBorder()).setTitle(title + gradeSlider.getValue());
        goodGradePanel.repaint();
    }//GEN-LAST:event_gradeSliderStateChanged

    private void noiseSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noiseSliderStateChanged
        Graph.getGraph().setNoise(noiseSlider.getValue());
        String title = "Noise - ";
        ((TitledBorder)noiseSliderPanel.getBorder()).setTitle(title + noiseSlider.getValue());// TODO add your handling code here:
        noiseSliderPanel.repaint();
    }//GEN-LAST:event_noiseSliderStateChanged

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GradeApp gradeApp = new GradeApp();
                //Center the app by setting it relative to null. This is a
                //weird property of the "setLocationRelativeTo" method.
                gradeApp.setLocationRelativeTo(null);
                gradeApp.setVisible(true);
                gradeApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emailButton;
    private javax.swing.JPanel goodGradePanel;
    private javax.swing.JSlider gradeSlider;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JSlider noiseSlider;
    private javax.swing.JPanel noiseSliderPanel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
