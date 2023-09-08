package PracticasEclipseAlgoritmos.Algoritmos;

public class VoltearStringStringBuilder {
    public static void main(String[] args) {
        String cadena = "Hola, mundo!";
        String cadenaVolteada = voltearString(cadena);
        System.out.println(cadenaVolteada);
    }
    public static String voltearString(String input) {
        StringBuilder resultado = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            //apend concatena
            resultado.append(input.charAt(i));
        }
        return resultado.toString();
    }
}
