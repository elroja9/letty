/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class MantProveedor extends javax.swing.JFrame {

    Proveedor proveedor=new Proveedor();
    boolean nuevo=false;
    /**
     * Creates new form MantProveedor
     */
    public MantProveedor() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENIMIENTO");

        jPanel1.setBackground(new java.awt.Color(70, 99, 138));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(14, 11, 49, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 10, 53, 30);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre);
        txtNombre.setBounds(270, 10, 130, 30);

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula);
        txtCedula.setBounds(70, 10, 130, 30);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar - copia.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(340, 80, 40, 40);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar - copia.png"))); // NOI18N
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar);
        btnAceptar.setBounds(290, 80, 40, 40);

        jLabel3.setText("Cancelar");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(340, 120, 50, 14);

        jLabel4.setText("Aceptar");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 120, 50, 14);

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        jPanel2.add(txtTel);
        txtTel.setBounds(70, 50, 130, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tel:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 50, 30, 30);

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(270, 50, 130, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 50, 50, 30);

        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("jLabel7");
        jPanel2.add(lbl);
        lbl.setBounds(40, 100, 230, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String mensaje=validarCampos();
        if(mensaje.equals("")){
        if(nuevo==true){

            try {
                // TODO add your handling code here:
                proveedor.setCed_juridica(txtCedula.getText());
                proveedor.setNombre(txtNombre.getText());
                proveedor.setTel(txtTel.getText());
                proveedor.setEmail(txtEmail.getText());
                BDProveedor.insertarProveedor(proveedor);
            } catch (SQLException ex) {
                Logger.getLogger(MantProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane,"Se ha registrado con éxito el nuevo proveedor","Registro con éxito",JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        }
        else{
            try {
                proveedor.setCed_juridica(txtCedula.getText());
                proveedor.setNombre(txtNombre.getText());
                proveedor.setTel(txtTel.getText());
                proveedor.setEmail(txtEmail.getText());
                BDProveedor.modificarProveedor(proveedor);
            } catch (SQLException ex) {
                Logger.getLogger(MantProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane,"Se ha actualizado con éxito el proveedor","Actualización con éxito",JOptionPane.PLAIN_MESSAGE);
            this.dispose();

        }
        txtCedula.setText("");
        txtNombre.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        }else{JOptionPane.showMessageDialog(rootPane, mensaje,"ERROR",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if(txtCedula.getText().length()>=15) evt.consume();
        if((car<'0' || car>'9')) {evt.consume(); lbl.setText("Digite solo números");
            lbl.setForeground(Color.red);}else{lbl.setForeground(Color.white);}
        if(txtCedula.getText().equals("")){lbl.setForeground(Color.white);}
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if(txtNombre.getText().length()>=15) evt.consume();
        if((car<'a' || car>'z') && (car<'A' || car>'Z')) {evt.consume(); lbl.setText("Solo letras");
            lbl.setForeground(Color.red);}else{lbl.setForeground(Color.white);}
        if(txtNombre.getText().equals("")){lbl.setForeground(Color.white);}
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if(txtTel.getText().length()>=15) evt.consume();
        if((car<'0' || car>'9')) {evt.consume(); lbl.setText("Digite solo números");
            lbl.setForeground(Color.red);}else{lbl.setForeground(Color.white);}
        if(txtTel.getText().equals("")){lbl.setForeground(Color.white);}
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailKeyTyped

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
            java.util.logging.Logger.getLogger(MantProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

     private String validarCampos(){
    
        String msj="";
        if(txtCedula.getText().equals("")){
        
            msj="Por favor ingrese la cédula del proveedor";
            txtCedula.requestFocus();
            return msj;
        }
        
         if(txtNombre.getText().equals("")){
        
            msj="Por favor ingrese el nombre del proveedor";
            txtNombre.requestFocus();
            return msj;
        }
                 
         if(txtTel.getText().equals("")){
        
            msj="Por favor ingrese el télefono del proveedor";
            txtTel.requestFocus();
            return msj;
        }
        int resp=JOptionPane.showConfirmDialog(rootPane,"Desea guardar el proveedor sin email",this.getTitle(),JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp==JOptionPane.NO_OPTION){ 
        if("".equals(txtEmail.getText())){
        
            msj="Por favor ingrese el email";
            txtEmail.requestFocus();
            return msj;
        }
        if(!"@".equals(txtEmail.getText())){
        
            msj="Por favor ingrese el @";
            txtEmail.requestFocus();
            return msj;            
        }
        }else{txtEmail.setText("");}
        
        return msj;
        
    }
}

