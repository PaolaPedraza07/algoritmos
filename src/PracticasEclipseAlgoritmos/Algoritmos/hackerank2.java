package PracticasEclipseAlgoritmos.Algoritmos;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class hackerank2 {


        public static String betterCompression(String S) {
            Map<Character, Integer> frequency = new HashMap<>();

            int i = 0;
            while (i < S.length()) {
                char c = S.charAt(i);
                StringBuilder countBuilder = new StringBuilder();

                i++;
                while (i < S.length() && Character.isDigit(S.charAt(i))) {
                    countBuilder.append(S.charAt(i));
                    i++;
                }

                int count = Integer.parseInt(countBuilder.toString());
                frequency.put(c, frequency.getOrDefault(c, 0) + count);
            }

            StringBuilder compressed = new StringBuilder();
            TreeMap<Character, Integer> sortedFrequency = new TreeMap<>(frequency);
            for (Map.Entry<Character, Integer> entry : sortedFrequency.entrySet()) {
                compressed.append(entry.getKey()).append(entry.getValue());
            }

            return compressed.toString();
        }

        public static void main(String[] args) {
            String S = "a12c56a165";
            System.out.println(betterCompression(S));
        }

}
