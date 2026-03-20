package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Combate combate = new Combate("Juancho", "Pancho");
        do{
            combate.combateTurnos(combate);
        }while(combate.combateTurnos(combate) != null);
    }
}
