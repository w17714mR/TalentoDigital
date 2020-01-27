import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("INGRESE LA CANTIDAD DE VECES QUE IMPRIMIR LOS PATRONES: ");
		int cantidad = s.nextInt();
		
		String patron1 = "*.";
		String patron2 = "1234";
		String patron3 = "||*";
		
		int indice = 0;
		while (indice<cantidad) {
			System.out.print(patron1);
			indice++;
		}
		System.out.println();
		indice = 0;
		while (indice<cantidad) {
			System.out.print(patron2);
			indice++;
		}
		System.out.println();
		indice = 0;
		while (indice<cantidad) {
			System.out.print(patron3);
			indice++;
		}

	}

}
