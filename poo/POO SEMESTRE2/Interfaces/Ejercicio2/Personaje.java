package Ejercicio2;

public class Personaje {
    protected DiccionarioMovimientos diccionario = new DiccionarioMovimientos(this);
    private String nombre;
    private int hp;
    private int atk;
    private int def;
    private boolean vivo;
    private boolean cubierto;
    protected String mov1;
    protected String mov2;
    protected String mov3;

    Personaje(String nombre, int hp, int atk, int def){
        this.nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.vivo = true;
        this.cubierto = false;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
    public int getHp() {
        return this.hp;
    }
    public boolean getVivo(){
        return this.vivo;
    }
    public boolean getCubierto(){
        return this.cubierto;
    }
    public void recibirDano(int dano){
        if(this.cubierto){
            System.out.println(this.nombre + " esta cubierto");
            return;
        }
        int danoTotal = dano * (int)(this.getDef()*0.05);
        this.hp = this.hp - danoTotal;
        System.out.println(this.nombre + " ha recibido " + danoTotal + " de dano total...");
        if(this.hp <= 0){
            this.vivo = false;
            System.out.println(this.nombre + " ha muerto.");
            return;
        }
        System.out.println("Vida actual de " + this.nombre + ": " + this.hp);
    }

}
