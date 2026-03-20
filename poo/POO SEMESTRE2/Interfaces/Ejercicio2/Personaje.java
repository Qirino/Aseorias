package Ejercicio2;
import java.util.*;

public abstract class Personaje {
    private DiccionarioMovimientos diccionario = new DiccionarioMovimientos(this);
    private Map<String, Stat> stats;
    private String nombre;
    private int hp;
    private boolean vivo;
    private boolean cubierto;
    protected String mov1;
    protected String mov2;
    protected String mov3;
    protected String mov4;

    private static Scanner sc = new Scanner(System.in);
    Personaje(String nombre, int hp, int atk, int def){
        this.nombre = nombre;
        this.hp = hp;
        this.vivo = true;
        this.cubierto = false;
        stats = new HashMap<>();
        stats.put("ATK", new Stat(atk, "ATK"));
        stats.put("DEF", new Stat(atk, "DEF"));
        stats.put("SPATK", new Stat(def, "SPATK"));
        stats.put("SPDEF", new Stat(def, "SPDEF"));
        stats.put("SPD", new Stat(def, "SPD"));
    }
    public Map<String, Stat> getStats() {
        return stats;
    }
    public Stat getStat(String indice){
        return this.stats.get(indice.toUpperCase());
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getValorAtk() {
        return this.stats.get("ATK").getValor();
    }
    public Stat getAtk(){
        return this.stats.get("ATK");
    }
    public int getValorDef() {
        return this.stats.get("DEF").getValor();
    }
    public Stat getDef() {
        return this.stats.get("DEF");
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
        int danoTotal = dano * (int)(this.getValorDef()*0.05);
        this.hp = this.hp - danoTotal;
        System.out.println(this.nombre + " ha recibido " + danoTotal + " de dano total...");
        if(this.hp <= 0){
            this.vivo = false;
            System.out.println(this.nombre + " ha muerto.");
            return;
        }
        System.out.println("Vida actual de " + this.nombre + ": " + this.hp);
    }
    public void movimiento(Personaje rival){
        System.out.println( "Que ataque quiere utilizar?");
        System.out.println(mov1 + "\n" + mov2 + "\n" + mov3 + "\n" + mov4 + "\n");
        String op = sc.nextLine().trim().replace(" ", "");
        String mov = this.mov1;
        if(op.equalsIgnoreCase(mov1))mov = this.mov1;
        if(op.equalsIgnoreCase(mov2))mov = this.mov2;
        if(op.equalsIgnoreCase(mov3))mov = this.mov3;
        if(op.equalsIgnoreCase(mov4))mov = this.mov4;
        this.diccionario.get(mov).tirarMovimiento(this, rival);
        System.out.println();
    }
    public void setMov(){
        System.out.println("Que movimiento quiere cambiar?");
        String op = sc.nextLine();
        System.out.println("Que movimiento quiere agregar?");
        String key = sc.nextLine().trim();
        if(diccionario.containsKey(key) && ((diccionario.get(key).getClass() == (diccionario.get(this.mov1)).getClass()) || diccionario.get(key) instanceof MovStatsUser)) {
            if(op.equalsIgnoreCase(mov1))this.mov1 = diccionario.get(key).getNombreMovimiento();
            if(op.equalsIgnoreCase(mov2))this.mov2 = diccionario.get(key).getNombreMovimiento();
            if(op.equalsIgnoreCase(mov3))this.mov3 = diccionario.get(key).getNombreMovimiento();
            if(op.equalsIgnoreCase(mov4))this.mov4 = diccionario.get(key).getNombreMovimiento();
        }
    }
}
        
        
