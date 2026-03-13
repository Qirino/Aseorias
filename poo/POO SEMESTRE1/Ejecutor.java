package poo;
public class Ejecutor {
    public static void main(String[] args) {
        Termo miTermo = new Termo(800);
        miTermo.ponerTapa();
        miTermo.agregarLiquido(0);
        miTermo.quitarTapa();
        miTermo.agregarLiquido(300);
        miTermo.ponerTapa();
        miTermo.abrirSwitch();
        miTermo.tomarLiquido(2);
        miTermo.tomarLiquido(3);
    }
}
