package PracticasEclipseAlgoritmos.Algoritmos;

public class TresNumsDivisiblesPorUnNumero {

    //En el ejemplo proporcionado, el arreglo {2, 3, 1, 6}
    // tiene dos tripletes que cumplen la condición: (2, 3, 1) y (2, 1, 6).
    // Ambas sumas son igual a 6, que es divisible por 3. Por lo tanto, el resultado impreso será 2.
            public static void main(String[] args) {
                int[] arr = {2, 3, 1, 6};
                int d = 3;
                int result = getTripletCount(arr, d);
                System.out.println(result); // Output: 2
            }

            public static int getTripletCount(int[] arr, int d) {
                int count = 0;
                int n = arr.length;

                for (int i = 0; i < n - 2; i++) {
                    for (int j = i + 1; j < n - 1; j++) {
                        for (int k = j + 1; k < n; k++) {
                            if ((arr[i] + arr[j] + arr[k]) % d == 0) {
                                count++;
                            }
                        }
                    }
                }

                return count;
            }
        }



