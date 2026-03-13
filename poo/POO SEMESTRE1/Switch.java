package poo;
public class Switch {
    private boolean open;

    public Switch() {
        this.open = false;
    }
    public void abrir() {
        if (!open){
            this.open = true;            
            System.out.println("El switch se ha abierto.");
        }else{
            System.out.println("El switch ya estaba abierto.");
        }
    }
    public void cerrar() {
        if (open){
            this.open = false;
            System.out.println("El switch se ha cerrado.");
        } else {
            System.out.println("El switch ya estaba cerrado.");
        }
    }
    public boolean isOpen() {
        return open;
    }
}
