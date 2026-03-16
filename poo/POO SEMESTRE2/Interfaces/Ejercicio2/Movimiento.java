package Ejercicio2;

public class Movimiento {
    public void tirarMovimiento(Personaje usuario, Personaje rival){
        
    }
    protected void fallarMov(int probabilidad){
        if((Math.random()*100) <= probabilidad){
            System.out.println("Pero fallo...");
        }
    }
}
