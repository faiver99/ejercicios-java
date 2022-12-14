
package ejercicios;


public class Ejercicios {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ejercicio 1
        ejercicio1 numeros= new ejercicio1();
        numeros.ingreso();
        
        // ejercicio 2              
        ejercicio2 persona = new ejercicio2("Juan", "Mas", 70);
        persona.imprimirDatos();
        
        // ejercicio 3
        ejercicio3 area= new ejercicio3();
        area.areas();
                
        // ejercicio 4 
        
        ejercicio4 ecuacion = new ejercicio4();
        ecuacion.obtenerDatos();
        ecuacion.calcularRaices();

        // ejercicio 5
        
        ejercicio5 absol= new ejercicio5();
        absol.absoluto();
        
        // ejercicio 6
        ejercicio6 prom= new ejercicio6();
        prom.promedio();
        
        // ejercicio 7
        System.out.println("Es el mismo que el 6");
        
        // ejercicio 8
        ejercicio8 cr= new ejercicio8();
        cr.circulo();
        
        // ejercicio 9
        ejercicio9 ms= new ejercicio9();
        ms.salario();
        
        // ejercicio 10
        ejercicio10 mr= new ejercicio10();
        mr.ecuacion();
        
        
    }
    
}
