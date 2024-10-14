public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;  
            }
        }
        return -1;  
    }

    public int busquedaBinaria(int[] arr, int valorBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == valorBuscado) {
                return medio; 
            }
            if (arr[medio] < valorBuscado) {
                inicio = medio + 1;  
            } else {
                fin = medio - 1;  
            }
        }
        return -1; 
    }

    // SECUENCIAL
    public int busquedaSecuencialConContador(int[] arreglo, int valorBuscado) {
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            comparaciones++;
            if (arreglo[i] == valorBuscado) {
                return comparaciones;
            }
        }
        return comparaciones;  
    }

    //BINARIA
    public int busquedaBinariaConContador(int[] arr, int valorBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;
        int comparaciones = 0;

        while (inicio <= fin) {
            comparaciones++;
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == valorBuscado) {
                return comparaciones;  
            }
            if (arr[medio] < valorBuscado) {
                inicio = medio + 1;  
            } else {
                fin = medio - 1;  
            }
        }
        return comparaciones;  
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }
}
