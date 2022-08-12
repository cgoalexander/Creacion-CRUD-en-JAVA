/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_usuario;

/**
 *
 * @author hp
 */
public class Profesor extends Usuario {
    private String tipoContrato;
    private String profesion;
    private String direccion;

    public Profesor(String tipoContrato, String profesion, String direccion, String nombre, String apellido, String edad, String sexo, String telefono, String email) {
        super(nombre, apellido, edad, sexo, telefono, email);
        this.tipoContrato = tipoContrato;
        this.profesion = profesion;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
       return "Nombre: " + getNombre()+ "\n" + 
              "Apellido: " + getApellido()+ "\n" + 
              "Edad: " + getEdad()+ "\n" + 
              "Sexo: " + getSexo()+ "\n" + 
              "Telefono: " + getTelefono()+ "\n" + 
              "Email: " + getEmail()+ "\n" + 
              "Direccion: " + getDireccion()+ "\n" + 
              "Tipo de contrato: " + getTipoContrato()+ "\n" + 
              "Profesión: " + getProfesion()+ "\n" ;
    }
    
    
    
}
