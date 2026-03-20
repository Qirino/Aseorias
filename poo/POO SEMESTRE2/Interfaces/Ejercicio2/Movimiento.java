package Ejercicio2;

public class Movimiento implements MovimientoStrategy{
    protected String nombreMovimiento;
    protected int probabilidad;
    protected int potencia;
    protected Personaje usuario;

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }
    public int getPotencia() {
        return potencia;
    }
    public int getProbabilidad() {
        return probabilidad;
    }
    public Personaje getUsuario() {
        return usuario;
    }
    public void tirarMovimiento(Personaje user, Personaje rival){
    }
    
    protected boolean fallarMov(int probabilidad){
        if((Math.random()*100) >= probabilidad){
            System.out.println(" pero fallo...");
            return true;
        }
        return false;
    }
    protected boolean rivalEstaMuerto(Personaje rival){
        if(!rival.getVivo()){
            System.out.println(rival.getNombre() + " ya esta muerto");
            return true;
        }
        return false;
    }
}
