package poo;
public class Tapa {
    private boolean puesta;
    private Switch switchTapa;

    public Tapa() {
        this.puesta = false;
        this.switchTapa = new Switch();
    }

    public void ponerTapa() {
        if (puesta == false) {
            puesta = true;
            System.out.println("La tapa se ha puesto.");
        } else {
            System.out.println("La tapa ya estaba puesta.");
        }
    }

    public void quitarTapa() {
        if (puesta == true) {
            puesta = false;
            System.out.println("La tapa ha sido removida.");
        } else {
            System.out.println("La tapa no esta puesta.");
        }
    }

    public boolean isPuesta() {
        return puesta;
    }

    public Switch getSwitchTapa() {
        return switchTapa;
    }
}
