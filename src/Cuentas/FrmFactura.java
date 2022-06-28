/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;


/**
 *
 * @author Jonathan
 */
public class FrmFactura extends javax.swing.JFrame {

    
    /**
     * Creates new form Factura
     */
    public FrmFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtNeto = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        checkBoxDescuento = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCedCliente = new javax.swing.JLabel();
        lblVence = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 99, 138));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("CÉDULA JURIDICA 3-101-3126-36-15");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 90, 310, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("FILADELFIA,CARRILLO,GTE");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 50, 310, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("COMERCIAL CACHAGUI S.A");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 70, 310, 20);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 320, 100);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Gaceta 171 pag.8 del 05/09/97");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 490, 310, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("FACTURA NO.");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 20, 100, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("FECHA:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(450, 50, 60, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("VENCE:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(450, 80, 60, 30);

        tblProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Código", "Descripción", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setFillsViewportHeight(true);
        tblProductos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblProductos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 670, 200);

        txtNeto.setEditable(false);
        txtNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNeto);
        txtNeto.setBounds(500, 510, 160, 30);

        txtSubtotal.setEditable(false);
        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setText("0");
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtSubtotal);
        txtSubtotal.setBounds(500, 420, 160, 30);

        txtDescuento.setEditable(false);
        jPanel2.add(txtDescuento);
        txtDescuento.setBounds(500, 450, 160, 30);

        txtImpuesto.setEditable(false);
        txtImpuesto.setForeground(new java.awt.Color(255, 255, 255));
        txtImpuesto.setText("0");
        jPanel2.add(txtImpuesto);
        txtImpuesto.setBounds(500, 480, 160, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Subtotal:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(440, 420, 60, 30);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Imp.Venta:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(430, 480, 70, 30);

        checkBoxDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkBoxDescuento.setText("Descuento:");
        checkBoxDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDescuentoActionPerformed(evt);
            }
        });
        jPanel2.add(checkBoxDescuento);
        checkBoxDescuento.setBounds(400, 450, 100, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Neto a Cobrar:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(400, 510, 100, 30);

        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(380, 390, 300, 160);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("LIBRERÍA Y BAZAR LETTY TeleFax 2688-8537");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(20, 30, 310, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Autorizado por dirección general de tributación");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 450, 310, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("directa mediante la resolución 11-97, artículo NO.7 ");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(50, 470, 310, 20);

        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel17);
        jLabel17.setBounds(40, 440, 300, 80);

        jLabel24.setText("Cancelar");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(610, 580, 50, 13);

        jLabel25.setText("Aceptar");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(550, 580, 50, 13);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar - copia.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(610, 550, 40, 33);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar - copia.png"))); // NOI18N
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar);
        btnAceptar.setBounds(550, 550, 40, 33);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CLIENTE:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(440, 110, 70, 30);

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(lblCliente);
        lblCliente.setBounds(510, 110, 130, 30);

        lblFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(lblFactura);
        lblFactura.setBounds(510, 20, 130, 30);

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(lblFecha);
        lblFecha.setBounds(510, 50, 130, 30);
        jPanel2.add(lblCedCliente);
        lblCedCliente.setBounds(350, 130, 0, 0);

        lblVence.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(lblVence);
        lblVence.setBounds(510, 80, 130, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GENERAR FACTURA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDescuentoActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_checkBoxDescuentoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void txtNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFactura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox checkBoxDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblCedCliente;
    public static javax.swing.JLabel lblCliente;
    public static javax.swing.JLabel lblFactura;
    public static javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblVence;
    public static javax.swing.JTable tblProductos;
    public static javax.swing.JTextField txtDescuento;
    public static javax.swing.JTextField txtImpuesto;
    public static javax.swing.JTextField txtNeto;
    public static javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables

    
    }

