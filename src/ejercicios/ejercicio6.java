package ejercicios;



import java.util.Scanner;

public class ejercicio6 {
  public void promedio () {
    Scanner scanner = new Scanner(System.in);
    
    // pedimos al usuario que ingrese cinco números
    System.out.println("Ingresa cinco números: ");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();
    double num4 = scanner.nextDouble();
    double num5 = scanner.nextDouble();
    
    // calculamos la suma de los cinco números
    double sum = num1 + num2 + num3 + num4 + num5;
    
    // calculamos el promedio de los cinco números
    double average = sum / 5;
    
    // mostramos la suma y el promedio
    System.out.println("La suma de los cinco números es: " + sum);
    System.out.println("El promedio de los cinco números es: " + average);
  }
}
