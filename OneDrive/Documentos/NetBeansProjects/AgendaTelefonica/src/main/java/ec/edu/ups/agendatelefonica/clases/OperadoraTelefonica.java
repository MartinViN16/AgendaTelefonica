package ec.edu.ups.agendatelefonica.clases;

public class OperadoraTelefonica {

    private int codigo;
    private String nombre;

    public OperadoraTelefonica() {
    }

    public OperadoraTelefonica(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "OperadoraTelefonica{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }        
    
}