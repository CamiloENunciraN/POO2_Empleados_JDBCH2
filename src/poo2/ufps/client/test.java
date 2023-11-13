
package poo2.ufps.client;

import java.sql.SQLException;
import poo2.ufps.model.Manage;

public class test {
        public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Manage m=new Manage();

        System.out.print("------------test de metodos de la bd------------\n");
        System.out.print(m.listarEmpleados()+"\n");
        System.out.print(m.agregarEmpleado(2, "pepito", 15, 0)+"\n");
        System.out.print(m.agregarEmpleado(3, "juanito", 17, 500)+"\n");
        System.out.print(m.actualizarEmpleado(3, "juanito", 17, 400)+"\n");
        System.out.print(m.listarEmpleados()+"\n");
        System.out.print(m.detallesEmpleado(3)+"\n");
        System.out.print(m.eliminarEmpleado(2)+"\n");
        System.out.print(m.listarEmpleados()+"\n");
        System.out.print(m.eliminarEmpleado(3)+"\n");
        System.out.print(m.listarEmpleados()+"\n");

    }
}
