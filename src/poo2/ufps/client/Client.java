
package poo2.ufps.client;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application{

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EmpleadosView.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Empleados");
        stage.setScene(scene);
        stage.show();
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
         launch(args);
    }
    
}
