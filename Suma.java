//metodos son los subconjuntos
import java.util.Scanner;
public class Suma {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int primerNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();        
        int result = primerNumero + segundoNumero;
        System.out.println(result);
    }
}