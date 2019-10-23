
package Modelo;

public class PilaEstudiantes {
    
        String nombre;
    String carnet;
    String fecha_nacimiento;
    
    PilaEstudiantes suguiente;

    public PilaEstudiantes(String nombre, String carnet, String fecha_nacimiento, PilaEstudiantes suguiente) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.fecha_nacimiento = fecha_nacimiento;
        this.suguiente = suguiente;
    }
    
    
    public PilaEstudiantes(String nombre, String carnet, String fecha_nacimiento)
    {
        this.carnet = carnet;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre = nombre;
        this.suguiente = null;
        
        
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

    public PilaEstudiantes getSuguiente() {
        return suguiente;
    }

    public void setSuguiente(PilaEstudiantes suguiente) {
        this.suguiente = suguiente;
    }
    
    
    
    
}
