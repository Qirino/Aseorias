package Medium;
import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Animal> listaAnimales = new ArrayList<>();
        Chango chango1 = new Chango("Punch");
        listaAnimales.add(chango1);
        Elefante elefante1 = new Elefante("Dumbo");
        listaAnimales.add(elefante1);
        Leon leon1 = new Leon("Simba");
        listaAnimales.add(leon1);
        CuidadorAnimales cuidador1 = new CuidadorAnimales("Juancito");
        cuidador1.alimentarTodosAnimales(listaAnimales);
        cuidador1.alimentarAnimalExigente(listaAnimales);
        
    }
}