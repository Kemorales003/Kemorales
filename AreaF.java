
import java.util.Scanner;

public class AreaF {
    /*
     * Método principal de la clase que se encarga de 
     * Multiplicar el valor de algunas de las areas y sumarlas para conformar la final
     * Los diferentes lados o areas puede ser conformado por números reales 
     */
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double sideR, sideH, sideA, areaC, areaFA, areatriangular, areaSC;

        // Obtener los valores de los lados (sides) H y R
        System.out.print("Ingresa el valor del lado R: ");
        sideR = scan.nextInt();

        System.out.print("Ingresa el valor del lado H: ");
        sideH = scan.nextInt();

        //Debemos hacer el calculo de ambos lados (raiz cuadrada de ladoH menos el ladoR al cuadrado)
        sideA = Math.sqrt((sideH*sideH)-(sideR*sideR));

        //Realizar el calculo de los dos triangulos para realizar el cálculo.
        areatriangular = (2*((sideA*sideR)/2));

        //Realizar el calculo para obtener el área del semicirculo
        areaSC = (((3.14159)*(sideR*sideR)/2));

        //Realiar la suma de todas las áreas
        areaFA = (areatriangular + areaSC);

        /*
         Calcular el área
        */
        // Mostrar el área de la forma A
        System.out.println("El área de la Forma es: " + areaFA );   
    }   
}