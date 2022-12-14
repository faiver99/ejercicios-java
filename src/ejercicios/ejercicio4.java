
package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    
   private double a, b, c; //coeficientes de la ecuación cuadrática

   public ejercicio4() {
    //constructor vacío
   }

   public void obtenerDatos() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el coeficiente a:");
      a = sc.nextDouble();
      System.out.println("Ingrese el coeficiente b:");
      b = sc.nextDouble();
      System.out.println("Ingrese el coeficiente c:");
      c = sc.nextDouble();
   }

   public void calcularRaices() {
       double discriminante = Math.pow(b, 2) - (4 * a * c);

       if (discriminante > 0) {
          double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
          double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
          System.out.println("Las raíces de la ecuación son: " + x1 + " y " + x2);
       } else if (discriminante == 0) {
          double x = -b / (2 * a);
          System.out.println("La ecuación tiene una raíz doble: " + x);
       } else {
          System.out.println("La ecuación no tiene raíces reales");
       }
    }
}




