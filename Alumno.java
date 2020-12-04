
package clases;


public class Alumno {
    private String nombre;
    private int edad;
    private String codigo;
private double estatura;



    public Alumno(String nombre, int edad, String codigo, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.estatura = estatura;
    }
    


    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos del alumno\n"
                +"Nombre: " + nombre
                +"Edad: "+edad
                +"Codigo: "+codigo
                +"Altura: "+estatura;
                
    }
    
    
    
}
