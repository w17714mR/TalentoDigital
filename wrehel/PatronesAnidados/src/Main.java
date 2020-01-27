import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("INGRESE ENE: ");
		Scanner s = new Scanner(System.in);
		int dimension = s.nextInt();
		int ancho, altura;

		ancho = 1;
		altura = 1;

		System.out.println("PATRON 1");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == 1 || ancho == dimension || altura == 1 || altura == dimension)
					System.out.print(" * ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}

		ancho = 1;
		altura = 1;

		System.out.println("PATRON 2");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == (dimension - altura + 1) || ancho == 1 || ancho == dimension)
					System.out.print(" * ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}

		ancho = 1;
		altura = 1;

		System.out.println("PATRON 3");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == altura || ancho == dimension - altura + 1)
					System.out.print(" X ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}

		ancho = 1;
		altura = 1;

		System.out.println("PATRON 4");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if ((altura == 1 && ancho > altura) || (altura == 5 && ancho < dimension)) {
					System.out.print("   ");
				} else {
					System.out.print(" X ");
				}
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}

	}
}