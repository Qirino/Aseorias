package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Guerrero("Machamp");

        personaje1.movimiento(personaje1);
        System.out.println(personaje1.getValorAtk());
        personaje1.movimiento(personaje1);
        System.out.println(personaje1.getValorAtk());
        personaje1.movimiento(personaje1);
    }
}
