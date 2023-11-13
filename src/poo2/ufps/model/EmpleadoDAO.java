
package poo2.ufps.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import poo2.ufps.bd.H2JDBCUtils;

public class EmpleadoDAO {
    
    public EmpleadoDAO() {

    }
    
    public String agregarEmpleado(int id, String nombre, int edad, double salario) throws SQLException {
        String res="";
        Connection conn = null;
	Statement statementOb = null;

		try {
			conn = H2JDBCUtils.getConnection();
			statementOb = conn.createStatement();

			StringBuffer sb = new StringBuffer();
			sb.append("INSERT INTO EMPLEADO (id, nombre, edad, salario) ");
			sb.append("VALUES ("+id+", '"+nombre+"', "+edad+", "+salario+")");

			statementOb.executeUpdate(sb.toString());
                        res="Empleado "+id+" agregado";
		} catch (SQLException e) {
			// print SQL exception information
                        res="Ha occurrido un error";
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
                                statementOb.close();
				conn.close();
			} catch (SQLException e) {
				// print SQL exception information
				e.printStackTrace();
			}
		}
        return res;
    }
    
    public String listarEmpleados() throws SQLException{
        String res="";
	Connection conn = null;
        Statement statementOb = null;

		try {
			conn = H2JDBCUtils.getConnection();
			statementOb = conn.createStatement();

			String sql = "SELECT id, nombre FROM EMPLEADO";
			ResultSet rs = statementOb.executeQuery(sql);
			
			while(rs.next()) { 
                            // Retrieve by column name 
                            int id  = rs.getInt("id"); 
                            String nombre = rs.getString("nombre");  

                            // creacion de la lista
                            res+=id+"-"+nombre+" /";
                        } 
			rs.close();
		} catch (SQLException e) {
			// print SQL exception information
                        res="Ha occurrido un error";
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				statementOb.close();
				conn.close();
			} catch (SQLException e) {
				// print SQL exception information
				e.printStackTrace();
			}

		}
        return res;
    }
    
    public String eliminarEmpleado(int id) throws SQLException{
        String res="";
        Connection conn = null;
        Statement statementOb = null;

		try {
			conn = H2JDBCUtils.getConnection();
			statementOb = conn.createStatement();

			StringBuffer sb = new StringBuffer();
			sb.append("DELETE FROM EMPLEADO WHERE id="+id+"");
			statementOb.executeUpdate(sb.toString());
                        res="Empleado "+id+" eliminado";
		} catch (SQLException e) {
			// print SQL exception information
                        res="Ha occurrido un error";
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				statementOb.close();
				conn.close();
			} catch (SQLException e) {
				// print SQL exception information
				e.printStackTrace();
			}
		}
        return res;
    }
    
    public String actualizarEmpleado(int id, String nombre, int edad, double salario) throws SQLException{
        String res="";
        Connection conn = null;
	Statement statementOb = null;

		try {
			conn = H2JDBCUtils.getConnection();
			statementOb = conn.createStatement();

			StringBuffer sb = new StringBuffer();
			sb.append("UPDATE EMPLEADO SET nombre = '"+nombre+"', edad = "+edad+", salario="+salario+"");
			sb.append("WHERE id="+id+"");
			statementOb.executeUpdate(sb.toString());
                        res="Empleado "+id+" actualizado";
		} catch (SQLException e) {
			// print SQL exception information
                        res="Ha occurrido un error";
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				statementOb.close();
				conn.close();
			} catch (SQLException e) {
				// print SQL exception information
				e.printStackTrace();
			}
		}
        return res;
    }
    
    public String detallesEmpleado(int id) throws SQLException{
        String res="";
        Connection conn = null;
        Statement statementOb = null;

		try {
			conn = H2JDBCUtils.getConnection();
			statementOb = conn.createStatement();

			String sql = "SELECT * FROM EMPLEADO WHERE id='"+id+"'";
			ResultSet rs = statementOb.executeQuery(sql);
			
			while(rs.next()) { 
                            // Retrieve by column name 
                            String nombre = rs.getString("nombre");  
                            int edad  = rs.getInt("edad"); 
                            Double salario=rs.getDouble("salario");
                            // creacion del string
                            res+=""+id+"-"+nombre+"-"+edad+"-"+salario;
                        } 
			rs.close();
		} catch (SQLException e) {
			// print SQL exception information
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				statementOb.close();
				conn.close();
			} catch (SQLException e) {
				// print SQL exception information
				e.printStackTrace();
			}

		}
        return res;
    }
}
