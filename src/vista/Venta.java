/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author mybas
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form IntPrincipal
     */
    public Venta() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/LGC_Icon.png"));
        setIconImage(icon);
        //Color JFrame
        Color Vinorest = new Color(142, 0, 16);
        this.getContentPane().setBackground(Vinorest);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGris = new javax.swing.JPanel();
        LabelOrden1 = new javax.swing.JLabel();
        NumOrden = new javax.swing.JTextField();
        LabelOrden = new javax.swing.JLabel();
        PanelBlanco = new javax.swing.JPanel();
        LabelPlatos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Le Grand Chevalier");
        setBackground(new java.awt.Color(142, 0, 16));
        setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        setMinimumSize(new java.awt.Dimension(960, 600));
        setName("MP"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        PanelGris.setBackground(new java.awt.Color(16, 19, 24));
        PanelGris.setMaximumSize(new java.awt.Dimension(960, 151));
        PanelGris.setMinimumSize(new java.awt.Dimension(960, 151));

        LabelOrden1.setFont(new java.awt.Font("Freestyle Script", 0, 72)); // NOI18N
        LabelOrden1.setForeground(new java.awt.Color(255, 255, 255));
        LabelOrden1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOrden1.setText("Total:");

        NumOrden.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        NumOrden.setForeground(new java.awt.Color(16, 19, 24));
        NumOrden.setBorder(null);
        NumOrden.setMaximumSize(new java.awt.Dimension(110, 40));
        NumOrden.setMinimumSize(new java.awt.Dimension(110, 40));
        NumOrden.setPreferredSize(new java.awt.Dimension(110, 40));

        javax.swing.GroupLayout PanelGrisLayout = new javax.swing.GroupLayout(PanelGris);
        PanelGris.setLayout(PanelGrisLayout);
        PanelGrisLayout.setHorizontalGroup(
            PanelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrisLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(LabelOrden1)
                .addGap(18, 18, 18)
                .addComponent(NumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGrisLayout.setVerticalGroup(
            PanelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrisLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PanelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelOrden1)
                    .addComponent(NumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        LabelOrden.setFont(new java.awt.Font("Freestyle Script", 0, 72)); // NOI18N
        LabelOrden.setForeground(new java.awt.Color(255, 255, 255));
        LabelOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOrden.setText("Ventas");

        PanelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco.setMaximumSize(new java.awt.Dimension(784, 331));
        PanelBlanco.setMinimumSize(new java.awt.Dimension(784, 331));
        PanelBlanco.setPreferredSize(new java.awt.Dimension(784, 331));

        LabelPlatos.setFont(new java.awt.Font("Freestyle Script", 0, 48)); // NOI18N
        LabelPlatos.setForeground(new java.awt.Color(16, 19, 24));
        LabelPlatos.setText("  Mesa   Orden                                       Valor");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(547);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(110);
        }

        javax.swing.GroupLayout PanelBlancoLayout = new javax.swing.GroupLayout(PanelBlanco);
        PanelBlanco.setLayout(PanelBlancoLayout);
        PanelBlancoLayout.setHorizontalGroup(
            PanelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
            .addGroup(PanelBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelBlancoLayout.setVerticalGroup(
            PanelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlancoLayout.createSequentialGroup()
                .addComponent(LabelPlatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesAdmin/vMenu normal.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(81, 56));
        jButton2.setMinimumSize(new java.awt.Dimension(81, 56));
        jButton2.setPreferredSize(new java.awt.Dimension(81, 56));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesAdmin/vMenu presionado.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesAdmin/vMenu arriba.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesAdmin/vMenu arriba.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329)
                        .addComponent(LabelOrden))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(PanelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelOrden)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(PanelGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminP elec = new AdminP();
        elec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelOrden;
    private javax.swing.JLabel LabelOrden1;
    private javax.swing.JLabel LabelPlatos;
    private javax.swing.JTextField NumOrden;
    private javax.swing.JPanel PanelBlanco;
    private javax.swing.JPanel PanelGris;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
