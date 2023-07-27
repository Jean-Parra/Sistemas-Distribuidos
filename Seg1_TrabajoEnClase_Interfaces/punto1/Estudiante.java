package Seg1_TrabajoEnClase_Interfaces.punto1;

public class Estudiante implements Persona {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String genero;
    private int edad;
    private String direccion;
    private long telefono;
    private String correo;
    private Double promedio;
    private int materias;
  

    public Estudiante(String nombre, String apellido, String ciudad, String genero, int edad, String direccion, long telefono, String correo, Double promedio, int materias) {
        this.nombre = nombre;
        this.apellido =apellido;
        this.ciudad = ciudad;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.promedio = promedio;
        this.materias = materias;
    }

    public Double getPromedio() {
        return promedio;
    }
    public int getMaterias() {
        return materias;
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