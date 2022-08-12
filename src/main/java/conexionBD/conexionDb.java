/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;

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
         
         String url="jdbc:mysql://localhost/figurageometrica";
         
        }      
        catch(ClassNotFoundException e){
            System.out.println("");   
        }
        
    }
    
    
    
    
}
