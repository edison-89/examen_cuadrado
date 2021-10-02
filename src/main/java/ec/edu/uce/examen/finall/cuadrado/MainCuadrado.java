package ec.edu.uce.examen.finall.cuadrado;

import java.util.Scanner;

public class MainCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("Programa de Figuras, seleccione opción:");
			System.out.println("1. Imagen cuadrado");
			System.out.println("2. SALIR");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				boolean dimensionesIncorrectas = true;// Por defecto inicia en true
				int dimension = 0;
				do {
					System.out.println("\nIngrese dimensión del cuadrado:");
					dimension = teclado.nextInt();
					if (dimension >= 5) {

						dimensionesIncorrectas = false;// Solo cuando todas las dimensiones son correctas en la
														// variable incorrectas le pongo falso, para que ya no
														// siga pidiendo

					} else {
						System.out.println("La DIMENSIÓN tiene que ser >= a 5");
					}
				} while (dimensionesIncorrectas);// También se puede poner dimensionesCorrectas==false, pero es
													// exactamente lo mismo
				// Una vez que ya ingreso las dimensiones correctas, grafico el rectangulo
				for (int fila = 0; fila < dimension; fila++) {
					for (int columna = 0; columna < dimension; columna++) {
						if (fila == columna || columna==(dimension-fila-1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				break;
			case 2:
				System.out.println("Saliendo del sistema....");
				break;
			default:
				System.out.println("Seleccione una opción correcta");
				break;
			}

		} while (opcion != 2);
	}

}
