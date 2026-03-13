package qwe;

public class Empleado extends Persona {
    protected double sueldo;
    
    public Empleado(double sueldo, String nombre, int edad, int id){
        super(nombre,edad,id);
        this.sueldo = sueldo;
    }
}
