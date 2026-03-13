package qwe;

public class Cliente extends Persona{
    private String numTelefono;

    public Cliente(String numTelefono, String nombre, int edad, int id){
        super(nombre,edad,id);
        this.numTelefono = numTelefono;
    }
}
