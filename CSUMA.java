
import java.util.Scanner;

/**
 * Esta es la clase Suma que se encarga de realizar
 *	la suma de dos números.
 * @author Miguel Catalán
 * @since  2024-078-28
 */

	public class CSuma {

		/**
     	* Método principal de la clase que se encarga de
     	* procesar la suma de dos números enteros.
     	* @param	args que representan un listado de valores 
     	*             al momento de ejecutar el programa.
     	* @since 2024-07-28
     	*/
		public static void main(String [] args) 
    	{
		
			// Se declara la variable scan para leer datos de la línea de comandos.
			Scanner scan = new Scanner(System.in);

			int primerNumero = scan.nextInt();
			int segundoNumero = scan.nextInt();

			int resultado = primerNumero + segundoNumero;

			System.out.println(resultado);
		}
	}


