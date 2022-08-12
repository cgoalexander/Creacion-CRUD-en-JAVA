/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_usuario;

/**
 *
 * @author hp
 */
public class Estudiante extends Usuario {
    private String facultad;
    private String carrera;
    private String semestre;
    private String direccion;

    public Estudiante(String facultad, String carrera, String semestre, String direccion, String nombre, String apellido, String edad, String sexo, String telefono, String email) {
        super(nombre, apellido, edad, sexo, telefono, email);
        this.facultad = facultad;
        this.carrera = carrera;
        this.semestre = semestre;
        this.direccion = direccion;
    }    

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
       return "Nombre: " + getNombre()+ "\n" + 
              "Apellido: " + getApellido()+ "\n" + 
              "Edad: " + getEdad()+ "\n" + 
              "Sexo: " + getSexo()+ "\n" + 
              "Telefono: " + getTelefono()+ "\n" + 
              "Email: " + getEmail()+ "\n" + 
              "Facultad: " + getFacultad()+ "\n" + 
              "Carrera: " + getCarrera()+ "\n" + 
              "Semestre: " + getSemestre()+ "\n" + 
              "Direccion: " + getDireccion()+ "\n" ;
    }
    
    
}
