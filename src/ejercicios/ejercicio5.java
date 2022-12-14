
package ejercicios;

import java.util.Scanner;  // Importa la clase Scanner

public class ejercicio5 {
     
    public void absoluto(){ 
    Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer desde la consola

    System.out.print("Ingresa un número: ");  // Pide al usuario que ingrese un número
    int numero = scanner.nextInt();  // Lee el número ingresado

    int valorAbsoluto = Math.abs(numero);  // Obtiene el valor absoluto del número
    System.out.println("El valor absoluto es: " + valorAbsoluto);  // Imprime el valor absoluto en consola
    }
  }

