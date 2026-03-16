package Ejercicio1;
public class Guerrero extends Personaje implements Habilidades, SubirAtaque, SubirDefensa, Cubrirse{
    public Guerrero(String nombre){
        super(nombre, 80, 15, 20, 2);
    }
    public void tirarHabilidad1(Personaje rival){
        if(!rival.getVivo()) return;
        System.out.println(this.nombre + " ha usado golpe...");
        this.ataqueDano(0.8, 85,rival);
    }
    public void tirarHabilidad2(Personaje rival){
        if(!rival.getVivo()) return;
        System.out.println(this.nombre + " ha usado espadazo...");
        this.ataqueDano(1.2,100, rival);
    }
    public void cubrirse(){
        this.cubierto = true;
        System.out.println(this.getNombre() + " se ha cubierto");
    }
    public void subirAtaque(){}
    public void subirDefensa(){}
    
}
