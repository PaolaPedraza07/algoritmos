package PracticasEclipseAlgoritmos.Algoritmos;

public class FibboCreacion {
    public static void main(String[] args) {
        int n = 10; // Cambia el valor de n para obtener la serie hasta el número deseado
        long[] fibonacci = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
