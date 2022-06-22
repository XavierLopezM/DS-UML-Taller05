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
public class Paciente extends Persona{
    
    protected String email;

    public Paciente(String email, String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email = email;
    }
    
    
    
    
    //si el doctor esta libre el paciente puede registrar cita 
    public boolean solicitarCita(){
        return false;
    }
}
