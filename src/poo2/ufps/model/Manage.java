
package poo2.ufps.model;

import java.sql.SQLException;

public class Manage {
private EmpleadoDAO empDao;
    
    public Manage() {
        this.empDao=new EmpleadoDAO();
    }

    public String agregarEmpleado(int id, String nombre, int edad, double salario) throws SQLException { 
        return this.empDao.agregarEmpleado(id, nombre, edad, salario);
    }

    public String listarEmpleados() throws SQLException {
        return this.empDao.listarEmpleados();
    }
    
    public String eliminarEmpleado(int id) throws SQLException {
        return this.empDao.eliminarEmpleado(id);
    }
    
    public String actualizarEmpleado(int id, String nombre, int edad, double salario) throws SQLException {
        return this.empDao.actualizarEmpleado(id, nombre, edad, salario);
    }
    
    public String detallesEmpleado(int id) throws SQLException {
        return this.empDao.detallesEmpleado(id);
    }
}
