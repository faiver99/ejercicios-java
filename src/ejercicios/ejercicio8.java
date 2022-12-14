
package ejercicios;



import java.util.Scanner;

public class ejercicio8 {
  public void circulo () {
    Scanner scanner = new Scanner(System.in);
    
    // pedimos al usuario que ingrese el radio del círculo
    System.out.println("Ingresa el radio del círculo: ");
    double radius = scanner.nextDouble();
    
    // calculamos el área del círculo
    double area = Math.PI * radius * radius;
    
    // calculamos el perímetro del círculo
    double perimeter = 2 * Math.PI * radius;
    
    // mostramos el área y el perímetro del círculo
    System.out.println("El área del círculo es: " + area);
    System.out.println("El perímetro del círculo es: " + perimeter);
  }
}
