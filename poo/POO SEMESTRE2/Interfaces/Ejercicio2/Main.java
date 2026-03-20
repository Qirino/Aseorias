package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Combate combate = new Combate("Juancho", "Pancho");
        do{
            combate.combateTurnos(combate);
        }while(combate.combateTurnos(combate) != null);

        Combate combate2 = new Combate("Juancho", "Pancho");
        combate2.getPersonaje1().setMov();
        do{
            combate2.combateTurnos(combate2);
        }while(combate2.combateTurnos(combate2) != null);
    }
}
