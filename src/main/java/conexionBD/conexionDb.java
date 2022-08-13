/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author hp
 */
public class conexionDb {
    public Connection AccesoDB(){
        
        Connection conexion = null;
        try{
         //cargar driver para acceder a los servicios de MySQL
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         //nos conectamos a la ruta de la base de datos local         
         String url="jdbc:mysql://localhost/registrousuario";
         conexion = DriverManager.getConnection(url, "root","123456");
        }      
        catch(ClassNotFoundException e){
            System.out.println("se presento un error inesperado");   
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la Base de Datos " + ex.getMessage());
        }
        return conexion;
    }
    
    public void primerQuery() throws SQLException{
        
        Connection conexion = AccesoDB();
        
        //crear una consulta para obtener tabla usuario
        String query = "SELECT * FROM usuario;";
        Statement consulta = conexion.createStatement();
        
        // usar metodo Result set para cargar los resultados obtenidos de la consulta
        
        ResultSet resultados = consulta.executeQuery(query);
        
        while(resultados.next()){
            
            System.out.print("Nombre: " + resultados.getString("Nombre") + " " +
                             "Apellido: " + resultados.getString("Apellido") + "\n" );
            
        }
        
        conexion.close();
              
        
        
    }
    
    
}
