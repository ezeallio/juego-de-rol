package ejerciciopracticasjuegos;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    private ButtonGroup botones;

    public Game() {
        initComponents();
        jProgressBar1.setVisible(false);
        jProgressBar2.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        ImageIcon ogro = new ImageIcon(getClass().getResource("/imagenes/ogro.jpg"));
        Image img = ogro.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        Icon tamaño = new ImageIcon(img);
        jLabel3.setIcon(tamaño);

        botones = new ButtonGroup();
        botones.add(jRadioButton1);
        botones.add(jRadioButton2);
        botones.add(jRadioButton3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(410, 490));
        setMinimumSize(new java.awt.Dimension(410, 490));
        setPreferredSize(new java.awt.Dimension(410, 490));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        jLabel1.setText("elije tu personaje:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 371, 37);

        jRadioButton1.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jRadioButton1.setText("Guerrero");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(90, 100, 240, 51);

        jRadioButton2.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jRadioButton2.setText("Arquero");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(90, 220, 220, 51);

        jRadioButton3.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jRadioButton3.setText("Mago");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(90, 330, 140, 51);

        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 420, 100, 23);

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(210, 350, 180, 20);

        jProgressBar2.setStringPainted(true);
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(10, 350, 180, 20);

        jButton2.setText("Ataque Básico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 380, 180, 23);

        jButton3.setText("Ataque Crítico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 380, 180, 23);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 180, 280);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 40, 180, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jRadioButton1.isSelected()) {
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jProgressBar1.setVisible(true);
            jProgressBar2.setVisible(true);
            jProgressBar1.setValue(100);
            jProgressBar1.setMinimum(0);
            jProgressBar2.setValue(100);
            jProgressBar2.setMinimum(0);
            jButton2.setToolTipText("+20 de daño");
            jButton3.setToolTipText("+30 de daño y -10 de vida para vos");
            ImageIcon guerrero = new ImageIcon(getClass().getResource("/imagenes/guerrero.png"));
            Image img = guerrero.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            Icon tamaño = new ImageIcon(img);
            jLabel2.setIcon(tamaño);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel1.setVisible(false);
        } else if (jRadioButton2.isSelected()) {
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jProgressBar1.setVisible(true);
            jProgressBar2.setVisible(true);
            jProgressBar1.setValue(100);
            jProgressBar1.setMinimum(0);
            jProgressBar2.setValue(80);
            jProgressBar2.setMinimum(0);
            jButton2.setToolTipText("Entre +10 y +30 de daño");
            jButton3.setToolTipText("30% de posibilidad de realizar un golpe de +40 de daño");
            ImageIcon arquero = new ImageIcon(getClass().getResource("/imagenes/arquero.jpg"));
            Image img = arquero.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            Icon tamaño = new ImageIcon(img);
            jLabel2.setIcon(tamaño);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel1.setVisible(false);
        } else if (jRadioButton3.isSelected()) {
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jProgressBar1.setVisible(true);
            jProgressBar2.setVisible(true);
            jProgressBar1.setValue(100);
            jProgressBar1.setMinimum(0);
            jProgressBar2.setValue(60);
            jProgressBar2.setMinimum(0);
            jButton2.setToolTipText("+30 de daño");
            jButton3.setToolTipText("+20 de daño y 50% de probabilidad de paralizar al ogro");
            ImageIcon mago = new ImageIcon(getClass().getResource("/imagenes/mago.gif"));
            Image img = mago.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            Icon tamaño = new ImageIcon(img);
            jLabel2.setIcon(tamaño);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel1.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton1.isSelected()) {
            Guerrero guerrero = new Guerrero();
            guerrero.ataquebasico();
            jProgressBar1.setValue(Ogro.vidaO);
            Ogro ogro = new Ogro();
            ogro.atacarguerrero();
            jProgressBar2.setValue(Guerrero.vidaG);
        } else if (jRadioButton2.isSelected()) {
            Arquero arquero = new Arquero();
            arquero.ataquebasico();
            jProgressBar1.setValue(Ogro.vidaO);
            Ogro ogro = new Ogro();
            ogro.atacararquero();
            jProgressBar2.setValue(Arquero.vidaA);
        } else if (jRadioButton3.isSelected()) {
            Mago mago = new Mago();
            mago.ataquebasico();
            jProgressBar1.setValue(Ogro.vidaO);
            Ogro ogro = new Ogro();
            ogro.atacarmago();
            jProgressBar2.setValue(Mago.vidaM);
        }

        if (Ogro.vidaO <= 0) {
            Game game = new Game();
            JOptionPane.showMessageDialog(null, "Has ganado!", "Felicidades!", WIDTH);
            game.setVisible(true);
            Ogro.vidaO = 100;
            Guerrero.vidaG = 100;
            Arquero.vidaA = 80;
            Mago.vidaM = 60;
        } else if (Guerrero.vidaG <= 0 || Arquero.vidaA <= 0 || Mago.vidaM <= 0) {
            Game game = new Game();
            JOptionPane.showMessageDialog(null, "Has perdido!", "Lo sentimos", WIDTH);
            game.setVisible(true);
            Ogro.vidaO = 100;
            Guerrero.vidaG = 100;
            Arquero.vidaA = 80;
            Mago.vidaM = 60;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jRadioButton1.isSelected()) {
            Guerrero guerrero = new Guerrero();
            guerrero.ataquecritico();
            jProgressBar1.setValue(Ogro.vidaO);
            jProgressBar2.setValue(Guerrero.vidaG);
            Ogro ogro = new Ogro();
            ogro.atacarguerrero();
            jProgressBar2.setValue(Guerrero.vidaG);
        } else if (jRadioButton2.isSelected()) {
            Arquero arquero = new Arquero();
            arquero.ataquecritico();
            if (arquero.ataque == false) {
                JOptionPane.showMessageDialog(null, "Fallo!", "", WIDTH);
            }
            jProgressBar1.setValue(Ogro.vidaO);
            Ogro ogro = new Ogro();
            ogro.atacararquero();
            jProgressBar2.setValue(Arquero.vidaA);

        } else if (jRadioButton3.isSelected()) {
            Mago mago = new Mago();
            mago.ataquecritico();
            jProgressBar1.setValue(Ogro.vidaO);
            if (mago.paraliza == true) {
                if(Ogro.vidaO > 0){
                JOptionPane.showMessageDialog(null, "Has paralizado al ogro!\nAtacas de nuevo!", "Bien hecho!", WIDTH);
                }
            } else {
                if(Ogro.vidaO > 0){
                JOptionPane.showMessageDialog(null, "No has paralizado al ogro!\nOgro ataca.", "Lo sentimos", WIDTH);
                }
                Ogro ogro = new Ogro();
                ogro.atacarmago();
                jProgressBar2.setValue(Mago.vidaM);
            }
        }

        if (Ogro.vidaO <= 0) {
            this.dispose();
            Game game = new Game();
            JOptionPane.showMessageDialog(null, "Has ganado!", "Felicidades!", WIDTH);
            game.setVisible(true);
            Ogro.vidaO = 100;
            Guerrero.vidaG = 100;
            Arquero.vidaA = 80;
            Mago.vidaM = 60;
        } else if (Guerrero.vidaG <= 0 || Arquero.vidaA <= 0 || Mago.vidaM <= 0) {
            this.dispose();
            Game game = new Game();
            JOptionPane.showMessageDialog(null, "Has perdido!", "Lo sentimos", WIDTH);
            game.setVisible(true);
            Ogro.vidaO=100;
            Guerrero.vidaG=100;
            Arquero.vidaA=80;
            Mago.vidaM=60;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
