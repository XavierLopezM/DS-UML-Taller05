/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author VICTOR
 */
public class Persona {
    
    
    protected String Usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;

    public Persona(String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        this.Usuario = Usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
    
    public boolean logIn(){
        
        return false;
        
    }
    
    
    public boolean logOut(){
        
        return false;
        
    }
        
    
}
