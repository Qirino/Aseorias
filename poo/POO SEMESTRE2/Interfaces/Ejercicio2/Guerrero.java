package Ejercicio2;

public class Guerrero extends Personaje{
    private MovimientoStrategy movimientoGolpe = new Golpe(this);
    private MovimientoStrategy movimientoEspadazo = new Espadazo(this);
    public Guerrero(String nombre){
        super(nombre, 80, 50, 60);
    }
    public void movimiento1(Personaje rival){
        this.movimientoGolpe.tirarMovimiento(rival);
    }
    public void movimiento2(Personaje rival){
        this.movimientoEspadazo.tirarMovimiento(rival);
    }
}
