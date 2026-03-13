package Ejercicio1;

public class Personaje{
    protected String nombre;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spd;
    protected int lvl;
    protected boolean vivo;

    protected Personaje(String nombre, int hp, int atk, int def, int spd){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.nombre = nombre;
        this.vivo = true;
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
    public boolean getVivo(){
        return vivo;
    }
    protected void tirarAtaque(double porcentaje, int prob, Personaje rival){
        if(Math.random() * 100 >= prob){
            System.out.println(this.getNombre() + " ha fallado :c");
            return;
        }
        int dano = (int)(this.getAtk()*porcentaje);
        String msjcrit = "";
        if ((int)(Math.random() * 100) < 7.5){
            dano = (int)(dano * 1.5);
            msjcrit = "(Ha sido golpe critico)";
        } 
        rival.hp -= dano * (rival.getDef() * 0.05); 
        if(this.muerto(rival)){
            return;
        }
        System.out.println("PAS...");
        System.out.println("La vida de " + rival.getNombre() + " ahora es de " + rival.getHp() + msjcrit);
    }

    protected boolean muerto(Personaje rival){
        if(rival.getHp() <= 0){
            System.out.println(rival.getNombre() + " ha muerto");
            rival.vivo = false;
            return true;
        }
        return false;
    }
}