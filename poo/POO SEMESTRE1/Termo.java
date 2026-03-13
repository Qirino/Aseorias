package poo;
import java.util.Random;
public class Termo {
    private Contenedor contenedorTermo;
    private Tapa tapaTermo;
    private Switch switchTermo;

    public Termo(int capacidad) {
        this.contenedorTermo = new Contenedor(capacidad);
        this.tapaTermo = new Tapa();
        this.switchTermo = new Switch();
        System.out.println("Termo creado con capacidad " + this.contenedorTermo.getCapacidad() + "ml y contenido inicial de " + this.contenedorTermo.getContenido() + "ml.");
    }
    
    public void ponerTapa() {
        this.tapaTermo.ponerTapa();
    }
    public void quitarTapa() {
        this.tapaTermo.quitarTapa();
    }
    public void abrirSwitch() {
        this.switchTermo.abrir();
    }
    public void cerrarSwitch() {
        this.switchTermo.cerrar();
    }
    public void agregarLiquido(int cantidad) {
        if(cantidad >= 0) {
            if (!this.tapaTermo.isPuesta()) {
                this.contenedorTermo.agregarLiquido(cantidad);
            }else {
                System.out.println("No se puede agregar líquido. La tapa está puesta.");
            }
        }
    }
    public void quitarLiquido(int cantidad) {
        if(cantidad >= 0) {   
            if (!this.tapaTermo.isPuesta() || this.switchTermo.isOpen()) {
                this.contenedorTermo.quitarLiquido(cantidad);
                System.out.println(cantidad + "ml de líquido removido.");
                        System.out.println("Contenido actual: " + this.contenedorTermo.getContenido() + "ml.");
            } else {
                System.out.println("No se puede quitar líquido. La tapa está puesta y el switch está cerrado.");
            }
        }
    }
    public void tomarLiquido(int tipoSorbo) {
        Random rand = new Random();
        if (this.tapaTermo.isPuesta() && this.switchTermo.isOpen()) {
            if(tipoSorbo > 0 && tipoSorbo < 4) {
                if (tipoSorbo == 1){
                        this.contenedorTermo.quitarLiquido(rand.nextInt(1,4));
                } else if (tipoSorbo == 2){
                        this.contenedorTermo.quitarLiquido(rand.nextInt(4,8));
                } else if (tipoSorbo == 3){
                        this.contenedorTermo.quitarLiquido(rand.nextInt(8,13));
                }
            System.out.println("Se ha tomado un sorbo de tipo " + tipoSorbo + ". EL contenido actual es " + this.contenedorTermo.getContenido() + "ml.");
            this.switchTermo.cerrar();
            } else {
                System.out.println("Tipo de sorbo no válido. Debe ser 1, 2 o 3.");
            }
        }else {
                System.out.println("No se puede tomar líquido. El switch está cerrado.");
        }
    }
}
