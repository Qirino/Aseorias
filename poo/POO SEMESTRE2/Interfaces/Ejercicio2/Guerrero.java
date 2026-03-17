package Ejercicio2;

public class Guerrero extends Personaje{
    public Guerrero(String nombre){
        super(nombre, 80, 50, 60);
        this.mov1 = "Golpe";
        this.mov2 = "Espadazo";
        this.mov3 = "golpe";
    }
    public void movimiento1(Personaje rival){
        this.diccionario.get(mov1).tirarMovimiento(this, rival);
    }
    public void movimiento2(Personaje rival){
        this.diccionario.get(mov2).tirarMovimiento(this, rival);
    }
    public void movimiento3(Personaje rival){
        this.diccionario.get(mov3).tirarMovimiento(this, rival);
    }
    public void setMov1(String key){
        if(diccionario.containsKey(key) && diccionario.get(key) instanceof MovAtkFisico){
            this.mov1 = key;
        }
    }
}
