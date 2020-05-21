/*
 * Clase Aeropuertos.
 * Define la clase Aeropuerto con sus atribos y metodos
 * 
 */

//package aeropuertos;

public class Aeropuertos {
private String codigo;
private String nombre;


public Aeropuertos(String cod, String nom) {
    codigo = cod;
    nombre = nom;
}

public String toString(){
return ("Codigo: "+codigo+" Nombre: "+nombre);
}

public String getNombre() {
return this.codigo;
}
}
