package PracticasEclipseAlgoritmos.Algoritmos;

public class VoltearString {
    public static void main(String[] args) {
        String cadena = "Hola, mundo";
        String cadenaVolteada = voltearString(cadena);
        System.out.println(cadenaVolteada);
    }
    public static String voltearString(String input) {
        char[] caracteres = input.toCharArray();
        int longitud = caracteres.length;

        for (int i = 0; i < longitud / 2; i++) {
            int x = longitud / 2;
            char temp = caracteres[i];
            caracteres[i] = caracteres[longitud - i - 1];
            caracteres[longitud - i - 1] = temp;
        }
        return new String(caracteres);
    }
}
