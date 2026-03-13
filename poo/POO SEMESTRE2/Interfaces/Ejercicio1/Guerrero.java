package Ejercicio1;
public class Guerrero extends Personaje implements Habilidad1{
    public Guerrero(){
        super(30, 6, 8, 2);
    }
    public void tirarHabilidad1(Personaje rival){
        System.out.println(this.nombre + " ha usado espadazo");
        rival.hp -= this.atk ;
        
    }
}
