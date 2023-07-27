package Seg1_TrabajoEnClase_Interfaces.punto1;

public class Docente implements Persona{
    private String nombre;
    private String apellido;
    private String ciudad;
    private String genero;
    private int edad;
    private String direccion;
    private long telefono;
    private String correo;
    private String asignatura;
    private int experiencia;

    public Docente(String nombre, String apellido, String ciudad, String genero, int edad, String direccion, long telefono, String correo, String asignatura, int experiencia) {
        this.nombre = nombre;
        this.apellido =apellido;
        this.ciudad = ciudad;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.asignatura = asignatura;
        this.experiencia = experiencia;
    }
    public String getAsignatura() { 
        return asignatura;
    }
    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCiudad() {
        return ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {            
        return telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
 
    
}
