package ejercicios;

public class ejercicio2 {

    private String nombre;
    private String sexo;
    private int peso;

    public ejercicio2(String nombre, String sexo, int peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Peso: " + this.peso);

    }
}
