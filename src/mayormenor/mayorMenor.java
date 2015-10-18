package mayormenor;

import java.io.*;

public class mayorMenor {

	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		int n, i, mayor, menor;
		System.out.print("Ingresa la cantidad de numeros: ");
		n = Integer.parseInt(leer.readLine());
		int numeros[] = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("Ingresa el numero numero " + (i + 1) + ": ");
			numeros[i] = Integer.parseInt(leer.readLine());
		}
		mayor = numeros[0];
		for (i = 1; i < n; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros [i];
			}
		}
		menor = mayor;
		for (i = 0; i < n; i++) {
			if (numeros [i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}
