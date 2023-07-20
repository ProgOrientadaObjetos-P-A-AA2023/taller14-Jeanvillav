/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Enlace {
 private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/trabajadores.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador tra) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula,"
                    + "nombres, "
                    + "correo,"
                    + "sueldo,"
                    + "mesSueldo)"
                    + "values ('%s','%s','%s',%s, '%s')", 
                    tra.obtenerCedula(), 
                    tra.obtenerNombres(),
                    tra.obtenerCorreo(),
                    tra.obtenerSueldo(),
                    tra.obtenerMesSueldo()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataTrabajador() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajadores;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador tra = new Trabajador();
                tra.establecerCedula(rs.getString("cedula"));
                tra.establecerNombres(rs.getString("nombres"));
                tra.establecerCorreo(rs.getString("correo"));
                tra.establecerSueldo(rs.getDouble("sueldo"));
                tra.establecerMesSueldo(rs.getString("mesSueldo"));

                lista.add(tra);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarSueldo");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}
    


