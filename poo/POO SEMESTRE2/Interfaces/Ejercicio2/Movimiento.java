package Ejercicio2;

public class Movimiento implements MovimientoStrategy{
    protected int probabilidad;
    protected int potencia;
    protected Personaje usuario;

    public void tirarMovimiento(Personaje rival){
        
    }
    protected void fallarMov(int probabilidad){
        if((Math.random()*100) >= probabilidad){
            System.out.print(" pero fallo...");
        }
    }
}
