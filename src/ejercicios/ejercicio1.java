package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

    // Creamos un objeto Scanner para leer desde el teclado
    Scanner scanner = new Scanner(System.in);

    // Pedimos al usuario que ingrese 5 números
    public void ingreso() {
        System.out.println("Ingrese 5 números: ");

        // Leemos los 5 números
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        // Calculamos el máximo y el mínimo de los 5 números
        int max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        // Calculamos la raíz cuarta del tercer número
        double raizCuarta = Math.pow(num3, 0.25);

        // Calculamos la potencia del primer número con el último número
        double potencia = Math.pow(num1, num5);

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Raíz cuarta del tercer número: " + raizCuarta);
        System.out.println("Potencia del primer número con el último: " + potencia);
    }

}
