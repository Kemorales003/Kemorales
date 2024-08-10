import java.util.Scanner;

public class areacirculo{
    /*
     * Método principal de la clase que se encarga de 
     * Multiplicar el valor del radio por si mismo para obtener el área
     * El radio puede ser conformado por números reales 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio, ac;

        // Obtener el valor del radio de la circunferencia
        System.out.print("Ingresa el radio de la circunferencia: ");
        radio = scanner.nextDouble();

        ac = ((3.14159)*(radio * radio));
        /*
         Calcular el área
        */
        // Mostrar el área de la circunferencia
        System.out.println("El área del círculo es: " + ac);
        
    }
    
}