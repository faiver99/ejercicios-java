
package ejercicios;

import java.util.Scanner;

public class ejercicio9  {
  public void salario () {
    Scanner scanner = new Scanner(System.in);
    // el salario actual del obrero
    System.out.println("Ingresa el salario actual del trabajador: ");
    double currentSalary = scanner.nextDouble();
    
    // el porcentaje de incremento del salario
    double increasePercentage = 0.25;
    
    // calculamos el incremento del salario en dólares
    double salaryIncrease = currentSalary * increasePercentage;
    
    // calculamos el nuevo salario del obrero
    double newSalary = currentSalary + salaryIncrease;
    
    // mostramos el nuevo salario del obrero
    System.out.println("El nuevo salario del obrero es: " + newSalary);
  }
}
