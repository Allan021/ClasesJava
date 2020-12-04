
package clases;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private int horasImpartidad;
    private double precio;
    //creando un arraylist de los alumnos
    
    
    
    public Asignatura(String nombre, int horasImpartidad, double precio) {
        this.nombre = nombre;
        this.horasImpartidad = horasImpartidad;
        this.precio = precio;
    }

    public void crearAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno alumno1 = new Alumno("Paola",15, "20230950404", 1.43);
        Alumno alumno2 = new Alumno("Pedro",19, "20230212124", 1.90);
        alumnos.add(new Alumno("Allan",19,"202010040269",1.65));//creando varios alumnos
        alumnos.add(alumno1);
        alumnos.add(alumno2);
    //anadiendo los alumnos
  
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasImpartidad() {
        return horasImpartidad;
    }

    public void setHorasImpartidad(int horasImpartidad) {
        this.horasImpartidad = horasImpartidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
