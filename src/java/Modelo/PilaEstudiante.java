/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author reuni
 */
    
public class PilaEstudiante {
    
    String nombre;
    String carnet;
    String born;
    PilaEstudiante siguiente;
    

    
    public PilaEstudiante(){
        
        String nombre;
        String carnet;
        String born;
    
    }

    
    public PilaEstudiante(String nombre, String carnet, String born, PilaEstudiante siguiente) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.born = born;
        this.siguiente = siguiente;
    }

    public PilaEstudiante(String nombre, String carnet, String born) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.born = born;
        this.siguiente = null;
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

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public PilaEstudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(PilaEstudiante siguiente) {
        this.siguiente = siguiente;
    }

   

    
   
}

