package Ejercicio1;

public class Personaje{
    protected String nombre;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spd;
    protected int lvl;

    protected Personaje(int hp, int atk, int def, int spd){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    
}