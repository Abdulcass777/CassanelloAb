

package algoritmos;


public class SumaArreglo {
		
		public static void main(String[] args) {
			int arreglo[] = { 1, 3, 8, 90, 92 };
			// Para obtener la suma recorremos el arreglo y sumamos cada valor
			int suma = 0;
			for (int x = 0; x < arreglo.length; x++) {
				suma = suma + arreglo[x];
			}
			// El promedio es la suma dividida entre la cantidad de elementos
			float promedio = suma / arreglo.length;
			System.out.printf("Suma: %d. Promedio: %f", suma, promedio);
		}
	}


