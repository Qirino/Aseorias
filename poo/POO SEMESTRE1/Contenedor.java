package poo;
public class Contenedor {
    private int contenido;  //en Ml
    private int capacidad;  //en Ml

    public Contenedor(int capacidad) {
        if(capacidad == 500 || capacidad == 800){
            this.capacidad = capacidad;
        } else {
            System.out.println("Capacidad no valida, se asigna 800ml por defecto.");
            this.capacidad = 800;
        }
        this.contenido = 0;
    }
    public void agregarLiquido(int cantidad) {
        if (cantidad >= 0) {
           if (this.contenido + cantidad <= this.capacidad){
            this.contenido += cantidad;
            System.out.println(cantidad + "ml de líquido agregado.");
           } else {
            System.out.println("No se puede agregar " + cantidad + "ml. Excede la capacidad del contenedor.");
           }
        } else {
            System.out.println("Cantidad a agregar debe ser positiva.");
        }
        System.out.println("Contenido actual: " + this.contenido + "ml.");
    }
    public void quitarLiquido(int cantidad) {
        if (cantidad >= 0) {
            if(this.contenido - cantidad >= 0){
                this.contenido -= cantidad;
            } else {
                System.out.println("No hay suficiente liquido en el contenedor.");
            }
        } else {
            System.out.println("Cantidad a remover debe ser positiva.");
        }
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getContenido() {
        return contenido;
    }
}
