
package clases;


public class Catedratico {
   private String nombre;
   private int edad;
   private String materia;
   private float sueldo;

    public Catedratico(String nombre, int edad, String materia, float sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Catedratico{" + "nombre=" + nombre + ", edad=" + edad + ", materia=" + materia + ", sueldo=" + sueldo + '}';
    }

   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
   
   
}
