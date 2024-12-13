package arraysLPD8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
      
        int[] numeros = new int[10];
        System.out.println("inserta 10 numeros plis");
        for(int i=0; i<10; i++) {
        	numeros[i]=scanner.nextInt();
        }

     
        System.out.println("array inicio:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " _ " + numeros[i]);
        }

      
        int[] reordenado = new int[numeros.length];
        int indice = 0;

     
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                reordenado[indice] = numeros[i];
                indice++;
            }
        }

     
        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                reordenado[indice] = numeros[i];
                indice++;
            }
        }

      
        System.out.println("array con números primos:");
        for (int i = 0; i < reordenado.length; i++) {
            System.out.println(i + " - " + reordenado[i]);
        }
    }

   
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
