
package poo2.ufps.controllers;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import poo2.ufps.model.Manage;

public class EmpleadosController implements Initializable{
private Manage myManage;

Label lblId;
Label lblNombre;
Label lblEdad;
Label lbllblSalario;
Label lblId2;
Label lblNombre2;
Label lblEdad2;
Label lblSalario2;
TextField txtId;
TextField txtNombre;
TextField txtEdad;
TextField txtSalario;
TextField txtId2;
TextField txtNombre2;
TextField txtEdad2;
TextField txtSalario2;
ListView lvEmpleados;
Button cmbAgregar;
Button cmbListarEmpleados;
Button cmbEliminar;
Button cmbCargarDetalles;
Button cmbActualizar;
Button cmbGuardar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      this.myManage=new Manage();
      this.cmbEliminar.setEnabled(false);
      this.cmbCargarDetalles.setEnabled(false);
      this.cmbActualizar.setEnabled(false);
      this.cmbGuardar.setEnabled(false);
      this.txtId2.setEnabled(false);
      this.txtNombre2.setEnabled(false);
      this.txtEdad2.setEnabled(false);
      this.txtSalario2.setEnabled(false);
      this.lvEmpleados.setDisable(true);
    }
    
    private void cmbAgregarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // TODO add your handling code here:
        String id=this.txtId.getText();
        String nombre=this.txtNombre.getText();
        String edad=this.txtEdad.getText();
        String salario=this.txtSalario.getText();
        
        if(id.isBlank()||nombre.isBlank()||edad.isBlank()||salario.isBlank()){
            this.ventanaEmergente("LLene los datos... o esto no va");
        }else{
           String msg= this.myManage.agregarEmpleado(Integer.parseInt(id),nombre,Integer.parseInt(edad),Double.parseDouble(salario));
           this.ventanaEmergente(msg);
            this.txtId.setText("");
            this.txtNombre.setText("");
            this.txtEdad.setText("");
            this.txtSalario.setText("");
        }
    }  
    
    private void cmbListarEmpleadosActionPerformed (java.awt.event.ActionEvent evt) throws SQLException {
        this.listarEmpleados();
    }
    private void listarEmpleados() throws SQLException{
        ObservableList<Object> items = FXCollections.observableArrayList();
        this.lvEmpleados.setItems(items);
        String [] lista=this.myManage.listarEmpleados().split("/");
       for(int i=0;i<lista.length;i++){
           String empleado=lista[i];
           items.add(empleado);
       }
        if(items.size()>1){
            this.lvEmpleados.setItems(items);
            this.cmbEliminar.setEnabled(true);
            this.cmbCargarDetalles.setEnabled(true);
        }else{
            this.cmbEliminar.setEnabled(false);
            this.cmbCargarDetalles.setEnabled(false);
        }
    }
    private void cmbEliminarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                            
        // TODO add your handling code here:
        String obj=(String) this.lvEmpleados.getSelectionModel().getSelectedItem();
        String [] empleado=obj.split("-");
        int id=Integer.parseInt(empleado[0]);
        String msg = this.myManage.eliminarEmpleado(id);
        this.ventanaEmergente(msg);
        this.listarEmpleados();
    }     
    private void cmbCargarDetallesActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                  
        // TODO add your handling code here:
        String obj=(String) this.lvEmpleados.getSelectionModel().getSelectedItem();
        String [] empleado=obj.split("-");
        int id=Integer.parseInt(empleado[0]);
        String msg = this.myManage.detallesEmpleado(id);
        String [] empleadoInfo=msg.split("-");
        if(empleado.length<2){
            this.ventanaEmergente(msg);
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

    }  
    private void cmbActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
            this.txtNombre2.setEditable(true);
            this.txtEdad2.setEditable(true);
            this.txtSalario2.setEditable(true);
            this.cmbGuardar.setEnabled(true);  
    }  
    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                           
        // TODO add your handling code here:
        String id=this.txtId2.getText();
        String nombre=this.txtNombre2.getText();
        String edad=this.txtEdad2.getText();
        String salario=this.txtSalario2.getText();
        
        if(id.isBlank()||nombre.isBlank()||edad.isBlank()||salario.isBlank()){
            this.ventanaEmergente("LLene los datos... o esto no va");
        }else{
            String msg = this.myManage.actualizarEmpleado(Integer.parseInt(id),nombre,Integer.parseInt(edad),Double.parseDouble(salario));
            this.ventanaEmergente(msg);
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

            this.listarEmpleados();
        }
    }   
    private void ventanaEmergente(String info){
        Alert alert = new Alert(AlertType.INFORMATION);
        // Configurar el título y el mensaje de la ventana emergente
        alert.setTitle("Ventana emergente");
        alert.setHeaderText("Información");
        alert.setContentText(info);
        // Mostrar la ventana emergente
        alert.showAndWait();
    }
}
