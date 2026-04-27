package ec.edu.ups.agendatelefonica.clases;

import java.util.Date;

public class Persona {
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;

    public Persona(String cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(Date fechaActual){
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
     
    
    
}