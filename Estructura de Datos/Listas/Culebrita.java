package Listas;

import java.util.LinkedList;

public class Culebrita {
    LinkedList<String> serpiente;

    public Culebrita(){
    this.serpiente = new LinkedList<>(); // Ahora sí inicializas la variable de la clase
    this.serpiente.add("1,2");
    this.serpiente.add("1,3");
    this.serpiente.add("1,4");
}
    public void moverAbajo() {
    String[] partesCabeza = serpiente.peekFirst().split(",");
    String[] partesCuello = serpiente.get(1).split(",");

    int xCabeza = Integer.parseInt(partesCabeza[0]);
    int yCabeza = Integer.parseInt(partesCabeza[1]);
    int yCuello = Integer.parseInt(partesCuello[1]);

    String neW = xCabeza + "," + (yCabeza - 1);

    if (yCabeza <= yCuello) {
        serpiente.addFirst(neW);
        serpiente.removeLast(); 
    }
}
public String toString() {
    String format = "Culebrita: " + String.join(" ", this.serpiente);
    return format;
}
}
