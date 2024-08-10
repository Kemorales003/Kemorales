import java.util.Scanner;

/*
 * Esta es la clase Promedio la cual se encargara de realizar:
 * Promedio de 4 evaluaciones durante el semestre
 * @author Kevin Morales
 * @since 2024-08-02
 */

public class PromedioCal {
    /*
     * Método principal de la clase que se encarga de 
     * Sumar la nota individual de cada calificación de las 4 evaluaciones 
     * Las notas son conformadas por números enteros    
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double evaluacion1, evaluacion2, evaluacion3, evaluacion4, promedio;

        // Obtener los puntajes de las evaluaciones
        System.out.print("Ingresa la calificación de la evaluación 1: ");
        evaluacion1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la evaluación 2: ");
        evaluacion2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la evaluación 3: ");
        evaluacion3 = scanner.nextDouble();

        System.out.print("Ingresa la calificación de la evaluación 4: ");
        evaluacion4 = scanner.nextDouble();

        // Calcular el promedio
        promedio = (evaluacion1 + evaluacion2 + evaluacion3 + evaluacion4) / 4;

        // Mostrar el promedio
        System.out.println("El promedio de las evaluaciones es: " + promedio);

        // Cerrar el scanner
        scanner.close();
    }
    