/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author bryan
 */
public class ColaEstudiantes {
    String nombre;
    String carnet;
    String fecha_nacimiento;
    
    ColaEstudiantes siguiente;

    public ColaEstudiantes(String nombre, String carnet, String fecha_nacimiento, ColaEstudiantes siguiente) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.fecha_nacimiento = fecha_nacimiento;
        this.siguiente = siguiente;
    }
    
    public ColaEstudiantes(String nombre, String carnet, String fecha_nacimiento)
    {
        this.carnet = carnet;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre = nombre;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ColaEstudiantes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ColaEstudiantes siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
    
    
    
}
