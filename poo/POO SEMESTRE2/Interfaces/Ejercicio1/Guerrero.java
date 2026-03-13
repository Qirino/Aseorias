package Ejercicio1;
public class Guerrero extends Personaje implements Habilidades, SubirAtaque, SubirDefensa, Cubrirse{
    public Guerrero(){
        super(80, 15, 18, 2);
    }
    public void tirarHabilidad1(Personaje rival){
        System.out.println(this.nombre + " ha usado golpe...");
        this.hacerDano(0.8, 15,rival);
    }
    public void tirarHabilidad2(Personaje rival){
        System.out.println(this.nombre + " ha usado espadazo...");
        this.hacerDano(1.5,30, rival);
    }
    
}
