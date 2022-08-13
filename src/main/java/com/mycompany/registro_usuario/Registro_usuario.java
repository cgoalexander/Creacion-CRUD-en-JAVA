/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registro_usuario;

import conexionBD.conexionDb;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Registro_usuario {

    public static void main(String[] args) throws SQLException {
        conexionDb conexion1 = new conexionDb();
        conexion1.primerQuery();
    }
}
