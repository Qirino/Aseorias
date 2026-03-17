package Ejercicio2;
import java.util.*;

public class DiccionarioMovimientos {
    private Map<String, Movimiento> movimientos;

    public DiccionarioMovimientos(Personaje usuario){
        movimientos = new HashMap<>();
        movimientos.put("Golpe", new MovAtkFisico(95, 60, "Golpe"));
        movimientos.put("Espadazo", new MovAtkFisico(85, 80, "Espadazo"));
        movimientos.put("Martillazo", new MovAtkFisico(75, 90, "Martillazo"));
    }
    public Movimiento get(String key){
        return movimientos.get(key);
    }
    public boolean containsKey(String key){
        if(movimientos.get(key) == null){
            return false;
        }
        return true;
    }
}
 