package Ejercicio2;

public class MovStatsUser extends Movimiento{
    private String stat;
    private char accion;
    private double multiplicador;

    public MovStatsUser(int probabilidad, String stat, String nombreMovimiento, char accion, double multiplicador){
        this.probabilidad = probabilidad;
        this.nombreMovimiento = nombreMovimiento;
        this.accion = accion;
        this.multiplicador = multiplicador;
        this.stat = stat.toUpperCase();
        
    }
    public void tirarMovimiento(Personaje user, Personaje rival){
        System.out.print(user.getNombre() + " ha usado " + this.nombreMovimiento + "...");
        if(fallarMov(this.probabilidad)) return;
        if(accion == 43) user.getStat(this.stat).aumentar(this.multiplicador);
        else user.getStat(this.stat).disminuir(this.multiplicador);
        System.out.println("El " + user.getStat(this.stat).getNombre() + " ha aumentado");
    }

}
