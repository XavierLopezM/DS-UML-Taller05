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
public class Doctor extends Persona{
    
    
    protected int regDoctor;
    protected String especialidad;
    protected AreaMedica area;

    public Doctor(int regDoctor, String especialidad, AreaMedica area, String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.area = area;
    }

    
    
    
    public void recetar(){
        
    }
    
    public void agregarPlanNutricional(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public void registrarSecretaria(){
        
    }
}
