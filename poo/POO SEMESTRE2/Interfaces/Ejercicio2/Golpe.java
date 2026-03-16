package Ejercicio2;

public class Golpe extends MovAtkFisico {
    private static int probabilidad = 95;
    public void tirarMovimiento(Personaje usuario, Personaje rival){
        System.out.println(usuario.getNombre() + " ha usado golpe");
        fallarMov(0);
        int dano = hacerDanoFisico(usuario, probabilidad);
        rival.recibirDano(dano);
    }
}
