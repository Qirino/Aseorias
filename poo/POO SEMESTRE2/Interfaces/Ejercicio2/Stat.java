package Ejercicio2;

public class Stat {
    private String nombre;
    private int valor;
    private final int valorMax = 200;

    public Stat(){

    }
    public Stat(int valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getValor() {
        return valor;
    }
    public int getValorMax() {
        return valorMax;
    }
    public int aumentar(double muliplicador){
        if(this.valor >= valorMax){
            System.out.println("No puede aumentar mas");
            return this.valor;
        }
        this.valor = this.valor + (int)((valorMax - this.valor)* (muliplicador*0.1));
        return this.valor;
    }
    public int disminuir(double muliplicador){
        if(this.valor <= 0) {
            System.out.println("No puede bajar mas");
            return this.valor;
        }
        this.valor = this.valor - (int)((this.valor) * (muliplicador*0.1));
        return this.valor;
    }
}
