package Ejercicio2;
public class MovAtkFisico extends Movimiento{
    protected int hacerDanoFisico(Personaje usuario, int potencia){
        int dano = potencia * usuario.getAtk();
        if(Math.random()*100 < 7.5){
            dano = (int)(dano * 1.5);
        }
        return dano;
    }
    
}
