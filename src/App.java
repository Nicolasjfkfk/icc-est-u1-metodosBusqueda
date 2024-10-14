import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        metodosBusqueda.printArreglo(arreglo);

        // Búsqueda Secuencial
        int posicionSecuencial = metodosBusqueda.busquedaSecuencial(arreglo, 50);
        if (posicionSecuencial != -1) {
            System.out.println("VALOR ENCONTRADO EN LA POSICION: " + posicionSecuencial);
        } else {
            System.out.println("VALOR NO ENCONTRADO ERROR 777");
        }

        // Búsqueda Binaria
        int posicionBinaria = metodosBusqueda.busquedaBinaria(arreglo, 50);
        if (posicionBinaria != -1) {
            System.out.println("VALOR ENCONTRADO: " + posicionBinaria);
        } else {
            System.out.println("VALOR NO ENCONTRADO (Binaria) ERROR 777");
        }

        // EJERCICIO EN CLASES 
        System.out.println("\n\n=== Búsqueda en arreglo de 1 a 100,000 ===");

        int[] arregloGrande = new int[100000];
        for (int i = 0; i < arregloGrande.length; i++) {
            arregloGrande[i] = i + 1;
        }

        // Búsqueda Secuencial
        long startTimeSec = System.nanoTime();
        int comparacionesSec = metodosBusqueda.busquedaSecuencialConContador(arregloGrande, 50418);
        long endTimeSec = System.nanoTime();
        System.out.println("Comparaciones búsqueda secuencial: " + comparacionesSec);
        System.out.println("Tiempo total búsqueda secuencial : " + (endTimeSec - startTimeSec));

        // Búsqueda Binaria
        long startTimeBin = System.nanoTime();
        int comparacionesBin = metodosBusqueda.busquedaBinariaConContador(arregloGrande, 50418);
        long endTimeBin = System.nanoTime();
        System.out.println("Comparaciones búsqueda binaria: " + comparacionesBin);
        System.out.println("Tiempo total búsqueda binaria : " + (endTimeBin - startTimeBin));

        scanner.close(); 
    }
}
