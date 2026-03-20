package Ejercicio2;

public class Combate { 
    private Personaje personaje1;
    private Personaje personaje2;
    private String status;
    private int turno;
    public Combate(String nombre1, String nombre2){
        personaje1 = new Guerrero(nombre1);
        personaje2 = new Guerrero(nombre2);
        this.status = "nada";
        this.turno = 1;
    }

    public Combate combateTurnos(Combate combate){
        if(this.personaje1.getVivo() == false|| this.personaje2.getVivo() == false){
            if(!this.personaje1.getVivo()) System.out.println(personaje1.getNombre() + " ha muerto, el combate ha terminado");
            else System.out.println(personaje2.getNombre() + " ha muerto, el combate ha terminado");
            return null;
        }
        System.out.println("Turno " + turno);
        System.out.println("Status del combate: " + status);
        turno++;
        personaje1.movimiento(personaje2);
        if(this.personaje1.getVivo() == false|| this.personaje2.getVivo() == false){
            if(!this.personaje1.getVivo()) System.out.println(personaje1.getNombre() + " ha muerto, el combate ha terminado");
            else System.out.println(personaje2.getNombre() + " ha muerto, el combate ha terminado");
            return null;
        }
        personaje2.movimiento(personaje1);
        return combate;
    }
    public Personaje getPersonaje1() {
        return this.personaje1;
    }
    public Personaje getPersonaje2() {
        return this.personaje2;
    }
}
