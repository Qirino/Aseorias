package Ejercicio1;

public class xd{
    public static void main(String[] args) {
        Guerrero juan = new Guerrero("Juan");
        Guerrero pancho = new Guerrero("Pancho");

        //juan.tirarHabilidad1(pancho);
        pancho.tirarHabilidad2(juan);
        juan.tirarHabilidad2(pancho);
        juan.tirarHabilidad2(pancho);
        juan.tirarHabilidad2(pancho);
        pancho.cubrirse();
        juan.tirarHabilidad2(pancho);
    }
}