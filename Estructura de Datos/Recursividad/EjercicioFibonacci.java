public class EjercicioFibonacci{
    public static void main(String[] args) {
        System.out.println(serieFibonacci(6));
        System.out.println(sumaDigitos(0));
        System.out.println(caminosCuadricula(3, 3));
    }
    public static int serieFibonacci(int indice){
        if(indice == 0) return 0;
        if(indice == 1) return 1;
        return serieFibonacci(indice-1) + serieFibonacci(indice-2);
    }
    public static int sumaDigitos(int numeros){
        if(numeros == 0) return 0;
        return (numeros % 10) + sumaDigitos(numeros/10);
    }
    public static int caminosCuadricula(int filas, int columnas){
        if(filas == 1 && columnas == 1) return 1;
        if(filas == 0 || columnas == 0) return 0;
        return caminosCuadricula(filas - 1, columnas) + caminosCuadricula(filas, columnas-1);
    }
}