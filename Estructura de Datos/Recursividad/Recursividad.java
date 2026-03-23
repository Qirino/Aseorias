public class Recursividad {
    //Multiplicar dos numeros(Suma recursiva)
    public static int multiplicar(int a, int b){
        if(b == 0) return 0;
        
        return a + multiplicar(a, b-1);
    }
    //Calcular la suma de un arreglo
    public static int sumarArreglo(int [] arreglo){
        return sumarArregloRecursivo(arreglo, arreglo.length-1);
    }
    private static int sumarArregloRecursivo(int[] arreglo, int indice){
        if(indice < 0) return 0;
        return arreglo[indice] + sumarArregloRecursivo(arreglo, indice - 1);
    }
    
    //Determinar si un numero es par
    public static boolean esPar(int n){
        n = Math.abs(n);

        if(n == 0) return true;
        if(n == 1) return false;
        return esPar(n-2);
    }

    //Determinar si es palindromo o no
    public static boolean esPalindromo(String word){
        word = word.toLowerCase();
        return esPalindromoRecur(word, 0, word.length() -1);
    }

    private static boolean esPalindromoRecur(String word, int inicio, int fin){
        if(inicio >= fin) return true;
        if(word.charAt(inicio) != word.charAt(fin)) return false;
        return esPalindromoRecur(word, inicio + 1, fin - 1);
    }

    //Buscar un elemento en un arreglo recursivamente
    public static int buscarElementoInt(int arreglo[], int elemento){

        return buscarElementoIntRecursivo(arreglo, elemento, 0);
    }
    private static int buscarElementoIntRecursivo(int arreglo[],int elemento, int indice){
        if(indice >= arreglo.length) return 0;
        if(arreglo[indice] == elemento) return indice+1;
        return buscarElementoIntRecursivo(arreglo, elemento, indice+1);
    }
}
