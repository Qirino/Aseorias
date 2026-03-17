package Ejercicio2;

public class Guerrero extends Personaje{
    private DiccionarioMovimientos diccionario = new DiccionarioMovimientos(this);
    public Guerrero(String nombre){
        super(nombre, 80, 50, 60);
    }
    public void movimiento1(Personaje rival){
        this.diccionario.get("Golpe").tirarMovimiento(this, rival);;
    }
    //public void movimiento2(Personaje rival){
    //    this.movimientoEspadazo.tirarMovimiento(rival);
    //}
}
