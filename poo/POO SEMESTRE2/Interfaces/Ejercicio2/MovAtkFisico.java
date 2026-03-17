package Ejercicio2;
public class MovAtkFisico extends Movimiento{
    protected int hacerDanoFisico(Personaje usuario, int potencia){
        int dano = (int)(potencia * 0.001 * usuario.getAtk());
        if(Math.random()*100 < 7.5){
            dano = (int)(dano * 1.8);
            System.out.print(" ha sido golpe critico");
        }
        return dano;
    }
    
}
