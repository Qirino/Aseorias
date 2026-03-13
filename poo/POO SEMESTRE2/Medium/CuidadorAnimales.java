package Medium;
import java.util.*;
public class CuidadorAnimales {
    private String nombreCuidador;

    Random rnd = new Random();

    public CuidadorAnimales(String nombre){
        this.nombreCuidador = nombre;
    }
    public String getnombreCuidador(){
        return this.nombreCuidador;
    }
    public void alimentarAnimal(Animal animal){
       System.out.println(animal.eatFood(500));
       System.out.println("Ya se ha alimentado a " + animal.getNombre());
    }
    public void alimentarAnimalExigente(List<Animal> listaAnimales){
        Animal animal = (listaAnimales.get(rnd.nextInt(listaAnimales.size())));
        animal.makeSound();
        System.out.println(animal.toString() + " tiene hambre");
        System.out.println("Dandole de comer a " + animal.toString() + "...");
        alimentarAnimal(animal);
    }
    public void alimentarTodosAnimales(List<Animal> listaAnimal){
        System.out.println("------------Alimentar a todos los animales------------");
         for(Animal animal : listaAnimal){
            System.out.println("Dandole de comer a " + animal.toString() + "...");
            System.out.println(animal.eatFood(500));
            System.out.println();
         }
         System.out.println("Ya se ha alimentado a todos los animales.");
    }
}