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

    //Gets
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public int getHp() {
        return hp;
    }
    public int getLvl() {
        return lvl;
    }
    public String getNombre() {
        return nombre;
    }
    public int getSpd() {
        return spd;
    }

    //Sets
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSpd(int spd) {
        this.spd = spd;
    }
    protected void hacerDano(double porcentaje, int prob, Personaje rival){
        if(Math.random() * 100 <= 30){
            System.out.println(this.getNombre() + " ha fallado :c");
            return;
        }
        int dano = (int)(this.getAtk()*1.5);
        if(Math.random() * 100 <= 10) dano = (int)(dano * 1.5);
        rival.hp -= dano; 
        System.out.println("'pas...'\nLa vida de " + rival.getNombre() + " ahora es de " + rival.getHp());
    }
}