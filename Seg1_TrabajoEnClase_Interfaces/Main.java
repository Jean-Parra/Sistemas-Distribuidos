package Seg1_TrabajoEnClase_Interfaces;
import Seg1_TrabajoEnClase_Interfaces.punto1.Docente;
import Seg1_TrabajoEnClase_Interfaces.punto1.Estudiante;
import Seg1_TrabajoEnClase_Interfaces.punto2.Derecho;
import Seg1_TrabajoEnClase_Interfaces.punto2.Mecanica;

public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Ali","Diaz","Bucaramanga","Masculino",100,"calle feliz",123456,"ali@123","Sistemas Distribuidos",10);
        Estudiante estudiante1 = new Estudiante("Jean", "Parra", "Bucaramanga", "Masculino", 20, "Carrera 17C #57-48", 3176990079L, "Jean.parra.2020@upb.edu.co", 4.50,10);
        System.out.println("\nPUNTO 1\n-------------------------------------------\n\nInformación del docente 1 \n\nNombre: "+docente1.getNombre() +" "+docente1.getApellido()+"\nCiudad: "+docente1.getCiudad()+"\nEdad: "+docente1.getEdad()+"\nGenero: "+docente1.getGenero()+"\nDirección: "+docente1.getDireccion()+"\nTelefono: "+docente1.getTelefono()+"\nCorreo: "+docente1.getCorreo()+"\nMateria: "+docente1.getAsignatura()+"\nAños de experiencia: "+docente1.getExperiencia()+"\n\n-------------------------------------------\n\nInformación del estudiante 1 \n\nNombre: "+estudiante1.getNombre() +" "+estudiante1.getApellido()+"\nCiudad: "+estudiante1.getCiudad()+"\nEdad: "+estudiante1.getEdad()+"\nGenero: "+estudiante1.getGenero()+"\nDirección: "+estudiante1.getDireccion()+"\nTelefono: "+estudiante1.getTelefono()+"\nCorreo: "+estudiante1.getCorreo()+"\nPromedio: "+estudiante1.getPromedio()+"\nMaterias: "+estudiante1.getMaterias()+"\n\n-------------------------------------------");
        
        Derecho derecho1 = new Derecho("Derecho", 50, 160, 500, 1000, "Presencial", 10, "Javeriana", null, null);
        Mecanica mecanica1 = new Mecanica("Mecanica", 60, 180, 600, 600, "Presencial", 9, "Bolivariana", null, null);
        System.out.println("\nPUNTO 2\n-------------------------------------------\n\nInformación de derecho 1 \n\nNombre: " +derecho1.getNombre()+"\nCantidad de materias: "+derecho1.getMaterias() +"\nCantidad de creditos: "+derecho1.getCreditos()+"\nCantidad de horas: "+derecho1.getHoras()+ "\nCantidad de personas: "+derecho1.getPersonas()+"\nModalidad: "+derecho1.getPrograma()+"\nCantidad de semestres: "+derecho1.getSemestres()+"\nUniversidad: "+derecho1.getUniversidad()+"\nMetodo 9: "+derecho1.getMetodo9()+"\nMetodo 10: "+derecho1.getMetodo10()+"\n\n-------------------------------------------\n\nInformación de mecanica 1: \n\nNombre: " +mecanica1.getNombre()+"\nCantidad de materias: "+mecanica1.getMaterias() +"\nCantidad de creditos: "+mecanica1.getCreditos()+"\nCantidad de horas: "+mecanica1.getHoras()+ "\nCantidad de personas: "+mecanica1.getPersonas()+"\nModalidad: "+mecanica1.getPrograma()+"\nCantidad de semestres: "+mecanica1.getSemestres()+"\nUniversidad: "+mecanica1.getUniversidad()+"\nMetodo 9: "+mecanica1.getMetodo9()+"\nMetodo 10:"+mecanica1.getMetodo10());

    }
    
}
