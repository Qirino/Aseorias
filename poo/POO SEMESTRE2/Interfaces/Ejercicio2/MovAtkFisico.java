package Ejercicio2;
public class MovAtkFisico extends Movimiento{
    public MovAtkFisico(int probabilidad, int potencia, String nombreMovimiento){
        this.nombreMovimiento = nombreMovimiento;
        this.probabilidad = probabilidad;
        this.potencia = potencia;
    }
    public void tirarMovimiento(Personaje user, Personaje rival){
        System.out.print(user.getNombre() + " ha usado " + this.nombreMovimiento + "...");
        fallarMov(probabilidad);
        int dano = hacerDanoFisico(user, potencia);
        System.out.println();
        rival.recibirDano(dano);
    }
    protected int hacerDanoFisico(Personaje usuario, int potencia){
        int dano = (int)(potencia * 0.001 * usuario.getAtk());
        if(Math.random()*100 < 7.5){
            dano = (int)(dano * 1.8);
            System.out.print(" ha sido golpe critico");
        }
        return dano;
    }
    
}
