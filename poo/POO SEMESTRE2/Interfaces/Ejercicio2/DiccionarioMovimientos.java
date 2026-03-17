package Ejercicio2;
import java.util.*;

public class DiccionarioMovimientos {
    private Map<String, Movimiento> movimientos;

    public DiccionarioMovimientos(Personaje usuario){
        movimientos = new HashMap<>();
        MovAtkFisico golpe = new MovAtkFisico(95, 60, "Golpe");
        movimientos.put("Golpe", golpe);
        movimientos.put("Espadazo", new MovAtkFisico(85, 80, "Espadazo"));
    }

    public Movimiento get(String key){
        return movimientos.get("Golpe");
    }
    
}
 