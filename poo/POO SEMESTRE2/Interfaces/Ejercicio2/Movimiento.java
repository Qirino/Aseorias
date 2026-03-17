package Ejercicio2;

public class Movimiento implements MovimientoStrategy{
    protected String nombreMovimiento;
    protected int probabilidad;
    protected int potencia;
    protected Personaje usuario;

    public void tirarMovimiento(Personaje user, Personaje rival){
        
    }
    protected void fallarMov(int probabilidad){
        if((Math.random()*100) >= probabilidad){
            System.out.print(" pero fallo...");
        }
    }
}
