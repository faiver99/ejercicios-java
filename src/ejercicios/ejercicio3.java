
package ejercicios;

import java.util.Scanner;


public class ejercicio3 {
    
  public void areas () {
    // Pedir al usuario los datos necesarios para calcular el área de cada figura
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingresa el lado del cuadrado: ");
    double ladoCuadrado = scanner.nextDouble();
    
    System.out.print("Ingresa la base y la altura del triángulo: ");
    double baseTriangulo = scanner.nextDouble();
    double alturaTriangulo = scanner.nextDouble();
    
    System.out.print("Ingresa el radio del círculo: ");
    double radioCirculo = scanner.nextDouble();
    
    // Calcular el área de cada figura y mostrar el resultado en pantalla
    double areaCuadrado = ladoCuadrado * ladoCuadrado;
    double areaTriangulo = baseTriangulo * alturaTriangulo / 2;
    double areaCirculo = Math.PI * radioCirculo * radioCirculo;
    
    System.out.println("Área del cuadrado: " + areaCuadrado);
    System.out.println("Área del triángulo: " + areaTriangulo);
    System.out.println("Área del circulo: " + areaCirculo);
    
  }
}
