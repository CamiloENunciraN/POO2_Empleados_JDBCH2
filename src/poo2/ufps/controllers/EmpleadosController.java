
package poo2.ufps.controllers;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
      this.cmbEliminar.setDisable(true);
      this.cmbCargarDetalles.setDisable(true);
      this.cmbActualizar.setDisable(true);
      this.cmbGuardar.setDisable(true);
      this.txtId2.setDisable(true);
      this.txtNombre2.setDisable(true);
      this.txtEdad2.setDisable(true);
      this.txtSalario2.setDisable(true);
      this.lvEmpleados.setDisable(true);
    }
    
    private void cmbAgregarEmpleado(ActionEvent event) throws SQLException {                                         
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
    
    private void cmbListarEmpleados (ActionEvent event) throws SQLException {
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
            this.cmbEliminar.setDisable(false);
            this.cmbCargarDetalles.setDisable(false);
        }else{
            this.cmbEliminar.setDisable(true);
            this.cmbCargarDetalles.setDisable(true);
        }
    }
    private void cmbEliminar(ActionEvent event) throws SQLException {                                            
        // TODO add your handling code here:
        String obj=(String) this.lvEmpleados.getSelectionModel().getSelectedItem();
        String [] empleado=obj.split("-");
        int id=Integer.parseInt(empleado[0]);
        String msg = this.myManage.eliminarEmpleado(id);
        this.ventanaEmergente(msg);
        this.listarEmpleados();
    }     
    private void cmbCargarDetalles(ActionEvent event) throws SQLException {                                                  
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
            this.cmbActualizar.setDisable(true);
        }else{
            this.txtId2.setText(empleadoInfo[0]);
            this.txtNombre2.setText(empleadoInfo[1]);
            this.txtEdad2.setText(empleadoInfo[2]);
            this.txtSalario2.setText(empleadoInfo[3]);
            this.cmbActualizar.setDisable(false);
        }

    }  
    private void cmbActualizar(ActionEvent event) {                                              
        // TODO add your handling code here:
            this.txtNombre2.setEditable(true);
            this.txtEdad2.setEditable(true);
            this.txtSalario2.setEditable(true);
            this.cmbGuardar.setDisable(false);  
    }  
    private void cmbGuardar(ActionEvent event) throws SQLException {                                           
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
            this.cmbGuardar.setDisable(true);
            this.cmbActualizar.setDisable(true);

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
