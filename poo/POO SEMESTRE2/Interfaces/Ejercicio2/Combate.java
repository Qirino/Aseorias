package Ejercicio2;

public class Combate {
    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("Juan");
        Guerrero guerrero2 = new Guerrero("Pedro");

        guerrero1.movimiento1(guerrero2);
        guerrero1.movimiento1(guerrero2);
        guerrero1.movimiento2(guerrero2);
        guerrero1.movimiento1(guerrero2);
        guerrero1.movimiento2(guerrero2);

    }
}
