/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo2.ufps.client;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import poo2.ufps.model.Manage;

/**
 *
 * @author red-iso
 */
public class SwingTest extends javax.swing.JFrame {
private Manage myManage;
    /**
     * Creates new form SwingTest
     */
    public SwingTest() {
        initComponents();
        this.myManage =new Manage();
        this.txtId2.setEditable(false);
        this.txtNombre2.setEditable(false);
        this.txtEdad2.setEditable(false);
        this.txtSalario2.setEditable(false);
        this.cmbActualizar.setEnabled(false);
        this.cmbCargarDetalles.setEnabled(false);
        this.cmbEliminar.setEnabled(false);
        this.cmbGuardar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        cmbAgregar = new javax.swing.JButton();
        cmbListarEmpleados = new javax.swing.JButton();
        txtId2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtEdad2 = new javax.swing.JTextField();
        txtSalario2 = new javax.swing.JTextField();
        cmbGuardar = new javax.swing.JButton();
        cmbActualizar = new javax.swing.JButton();
        cmbEliminar = new javax.swing.JButton();
        cmbCargarDetalles = new javax.swing.JButton();
        lvEmpleados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbAgregar.setText("Agregar");
        cmbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgregarActionPerformed(evt);
            }
        });

        cmbListarEmpleados.setText("Listar Empleados");
        cmbListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListarEmpleadosActionPerformed(evt);
            }
        });

        cmbGuardar.setText("Guardar");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });

        cmbActualizar.setText("Actualizar");
        cmbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActualizarActionPerformed(evt);
            }
        });

        cmbEliminar.setText("Eliminar");
        cmbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEliminarActionPerformed(evt);
            }
        });

        cmbCargarDetalles.setText("Cargar Detallles");
        cmbCargarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargarDetallesActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Salario:");

        jLabel5.setText("Id:");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Salario:");

        jLabel8.setText("Edad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31)
                        .addComponent(cmbAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(cmbListarEmpleados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lvEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cmbEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(cmbCargarDetalles))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(cmbActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cmbGuardar)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAgregar))))
                .addGap(18, 18, 18)
                .addComponent(cmbListarEmpleados)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEliminar))
                .addGap(12, 12, 12)
                .addComponent(cmbCargarDetalles)
                .addGap(18, 18, 18)
                .addComponent(cmbActualizar)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGuardar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    private void cmbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgregarActionPerformed
        // TODO add your handling code here:
        String id=this.txtId.getText();
        String nombre=this.txtNombre.getText();
        String edad=this.txtEdad.getText();
        String salario=this.txtSalario.getText();
        
        if(id.isBlank()||nombre.isBlank()||edad.isBlank()||salario.isBlank()){
            JOptionPane.showMessageDialog(null, "LLene los datos... o esto no va");
        }else{
           String msg="";
            try {
                msg = this.myManage.agregarEmpleado(Integer.parseInt(id),nombre,Integer.parseInt(edad),Double.parseDouble(salario));
            } catch (SQLException ex) {
                Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, msg);
            this.txtId.setText("");
            this.txtNombre.setText("");
            this.txtEdad.setText("");
            this.txtSalario.setText("");
        }
    }//GEN-LAST:event_cmbAgregarActionPerformed

    private void cmbListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListarEmpleadosActionPerformed
    try {
        // TODO add your handling code here:
        this.listarEmpleados();
    } catch (SQLException ex) {
        Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_cmbListarEmpleadosActionPerformed
    private void listarEmpleados() throws SQLException{
        this.lvEmpleados.removeAllItems();
        String [] lista=this.myManage.listarEmpleados().split("/");
        for(int i=0; i<lista.length;i++){
            this.lvEmpleados.addItem(lista[i]);
        }
        if(this.lvEmpleados.getItemCount()!=0){
            this.cmbEliminar.setEnabled(true);
            this.cmbCargarDetalles.setEnabled(true);
        }else{
            this.cmbEliminar.setEnabled(false);
            this.cmbCargarDetalles.setEnabled(false);
        }
    }
    private void cmbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEliminarActionPerformed
        // TODO add your handling code here:
        String [] empleado=((String) this.lvEmpleados.getSelectedItem()).split("-");
        int id=Integer.parseInt(empleado[0]);
        String msg = "";
    try {
        msg = this.myManage.eliminarEmpleado(id);
    } catch (SQLException ex) {
        Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
    }
        JOptionPane.showMessageDialog(null, msg);
    try {
        this.listarEmpleados();
    } catch (SQLException ex) {
        Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_cmbEliminarActionPerformed

    private void cmbCargarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargarDetallesActionPerformed
        // TODO add your handling code here:
        String [] empleado=((String) this.lvEmpleados.getSelectedItem()).split("-");
        int id=Integer.parseInt(empleado[0]);
        String msg = "";
    try {
        msg = this.myManage.detallesEmpleado(id);
    } catch (SQLException ex) {
        Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
    }
        String [] empleadoInfo=msg.split("-");
        if(empleado.length<2){
            JOptionPane.showMessageDialog(null, msg);
            this.txtId2.setText("");
            this.txtNombre2.setText("");
            this.txtEdad2.setText("");
            this.txtSalario2.setText("");
            this.cmbActualizar.setEnabled(false);
        }else{
            this.txtId2.setText(empleadoInfo[0]);
            this.txtNombre2.setText(empleadoInfo[1]);
            this.txtEdad2.setText(empleadoInfo[2]);
            this.txtSalario2.setText(empleadoInfo[3]);
            this.cmbActualizar.setEnabled(true);
        }

    }//GEN-LAST:event_cmbCargarDetallesActionPerformed

    private void cmbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActualizarActionPerformed
        // TODO add your handling code here:
            this.txtNombre2.setEditable(true);
            this.txtEdad2.setEditable(true);
            this.txtSalario2.setEditable(true);
            this.cmbGuardar.setEnabled(true);  
    }//GEN-LAST:event_cmbActualizarActionPerformed

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed
        // TODO add your handling code here:
        String id=this.txtId2.getText();
        String nombre=this.txtNombre2.getText();
        String edad=this.txtEdad2.getText();
        String salario=this.txtSalario2.getText();
        
        if(id.isBlank()||nombre.isBlank()||edad.isBlank()||salario.isBlank()){
            JOptionPane.showMessageDialog(null, "LLene los datos... o esto no va");
        }else{
            String msg = "";
            try {
                msg = this.myManage.actualizarEmpleado(Integer.parseInt(id),nombre,Integer.parseInt(edad),Double.parseDouble(salario));
            } catch (SQLException ex) {
                Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, msg);
            //this.ventanaEmergente(msg);
            this.txtId2.setText("");
            this.txtNombre2.setText("");
            this.txtEdad2.setText("");
            this.txtSalario2.setText("");
            this.txtNombre2.setEditable(false);
            this.txtEdad2.setEditable(false);
            this.txtSalario2.setEditable(false);
            this.cmbGuardar.setEnabled(false);
            this.cmbActualizar.setEnabled(false);
            try {
                this.listarEmpleados();
            } catch (SQLException ex) {
                Logger.getLogger(SwingTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(SwingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbActualizar;
    private javax.swing.JButton cmbAgregar;
    private javax.swing.JButton cmbCargarDetalles;
    private javax.swing.JButton cmbEliminar;
    private javax.swing.JButton cmbGuardar;
    private javax.swing.JButton cmbListarEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> lvEmpleados;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalario2;
    // End of variables declaration//GEN-END:variables
}
