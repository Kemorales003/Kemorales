import java.util.Scanner;
/*
 * Esta es la clase Area que se encarga de realiazar:
 * Calcular area de un rectangulo
 * Calcular area de un triangulo
 * Realizar calculo de un area que combina ambas formas
 */
public class Area {
    /*
     * *Metodo principal de la clase que se encarga de 
     * Procesar el calculo de areas de un triangulo y rectangulo
     * La suma de ambas areas
     */
    public static void main (String [] args) {
        /*Se declara la variable Scan para datos de lineas de comandos Scanner scan */
        Scanner scan = new Scanner(System.in);
        int altR = scan.nextInt();
        int baseR = scan.nextInt();        
        int resultR = altR * baseR;
        System.out.println(resultR);
        int altT = scan.nextInt();
        int baseT = scan.nextInt();        
        int resultT = (altR * baseR)/2;
        System.out.println(resultT);
        int resultadoArea = resultR + resultT
        System.out.println(resultadoArea);
      }
}