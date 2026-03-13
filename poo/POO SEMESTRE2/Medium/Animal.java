package Medium;

public abstract class Animal {
    private String nombre;
    private String foodType;

    protected Animal(String nombre, String foodType){
        this.nombre = nombre;
        this.foodType = foodType;

    }
    protected String getNombre(){
        return this.nombre;
    }
    private String getFoodType(){
        return this.foodType;
    }
    protected String eatFood(int food){
        if(food <= 0) return this.nombre + " ya no puede comer mas";
        return this.nombre + " esta comiendo " + getFoodType() +"...\n" + eatFood(food - 200);
    }
    protected void makeSound(){
        System.out.print("*" + getNombre() + "* ");
        System.out.println("*" + getNombre() + "*");
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
}                    
 