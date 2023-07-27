package Seg1_TrabajoEnClase_Interfaces.punto2;

public class Derecho implements Programa{
    private String nombre;
    private int materias;
    private int creditos;
    private int horas;
    private int personas;
    private String programa;
    private int semestres;
    private String universidad;
    private String metodo9;
    private String metodo10;

    public Derecho(String nombre, int materias, int creditos, int horas, int personas, String programa, int semestres, String universidad,String metodo9, String metodo10) {
        this.nombre = nombre;
        this.materias = materias;
        this.creditos = creditos;
        this.horas = horas;
        this.personas = personas;
        this.programa = programa;
        this.semestres = semestres;
        this.universidad = universidad;
        this.metodo9 = metodo9;
        this.metodo10 = metodo10;
    }
    public String getMetodo9() {
        return metodo9;
    }

    public String getMetodo10() {
        return metodo10;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getMaterias() {
        return materias;
    }

    @Override
    public int getCreditos() {
        return creditos;
    }

    @Override
    public int getHoras() {
        return horas;
    }

    @Override
    public int getPersonas() {
        return personas;
    }

    @Override
    public String getPrograma() {
        return programa;

    }

    @Override
    public int getSemestres() {
        return semestres;
    }

    @Override
    public String getUniversidad() {
        return universidad;
    }
    
}
