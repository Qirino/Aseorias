package Listas;


public class CulebritaMain {
    public static void main(String[] args) {
        Culebrita culebrita = new Culebrita();

        System.out.println(culebrita.toString());
        culebrita.moverAbajo();
        System.out.println(culebrita.toString());
    }   
}
