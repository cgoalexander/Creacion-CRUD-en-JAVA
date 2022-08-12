/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_usuario;

/**
 *
 * @author hp
 */
public class Administrativo extends Usuario {
    
    private String cargo;
    private String departamentoAsignado;

    public Administrativo(String cargo, String departamentoAsignado, String nombre, String apellido, String edad, String sexo, String telefono, String email) {
        super(nombre, apellido, edad, sexo, telefono, email);
        this.cargo = cargo;
        this.departamentoAsignado = departamentoAsignado;
    }

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    public void setDepartamentoAsignado(String departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    @Override
    public String toString() {
       return "Nombre: " + getNombre()+ "\n" + 
              "Apellido: " + getApellido()+ "\n" + 
              "Edad: " + getEdad()+ "\n" + 
              "Sexo: " + getSexo()+ "\n" + 
              "Telefono: " + getTelefono()+ "\n" + 
              "Email: " + getEmail()+ "\n" + 
              "Cargo: " + getCargo()+ "\n" + 
              "Departamento Asignado: " + getDepartamentoAsignado()+ "\n";
    
    }
    
    
    
    
    
}
