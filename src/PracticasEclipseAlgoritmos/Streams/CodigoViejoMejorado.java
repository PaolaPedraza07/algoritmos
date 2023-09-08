package PracticasEclipseAlgoritmos.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodigoViejoMejorado {

    //Ejemplo 1: Iteración a través de una lista
    public static void main(String[] args) {

        //Java 7
        List<String> lista = Arrays.asList("Manzana", "Banana", "Cereza");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        //Java 8
        List<String> listaMejorada = Arrays.asList("Uva", "Fresa", "Mango");
        /*listaMejorada.stream().toList();
        System.out.println(listaMejorada);*/

        listaMejorada.forEach(fruta -> System.out.println(fruta));
    }


    //Ejemplo 2: Filtrado de una lista por numeros pares
    public static void filtrarLista(){
        //2 ejemplo
        //Java 7
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        //Java 8
        List<Integer> numerosMejorado = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosParesMejorado = numerosMejorado.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        numerosParesMejorado.forEach(numeross -> System.out.println(numeross));
        //numerosParesMejorado.forEach(System.out::println);
    }

    //Ejemplo 3 loops
    public void loopsStreams(){
        //Opcion básica
        for (int i =0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("----------");

        //Opcion streams mejorada
        IntStream.range(0,5)
                .mapToObj(i -> "# " + i )
                .forEach(System.out::println);
    }

    //Ejemplo 5 sumar todos los numeros
    int[] numeros = {1,2,3};
    int resultado1= sumar(numeros);

    public static int sumar(int[] numeros){
        int resultado = 0;
        for (int num : numeros){
            resultado+= num;
        }
        return resultado;
    }


    //Ejemplo 4: Uso de interfaces funcionales y expresiones lambda
    //Java 7
    public interface Calculadora {
        int operacion(int a, int b);
    }

    public class CalculadoraSuma implements Calculadora {
        @Override
        public int operacion(int a, int b) {
            return a + b;
        }
    }

    //Java 8
    @FunctionalInterface
    public interface CalculadoraMejorado {
        int operacion(int a, int b);
    }

    public class Main {
        public static void main(String[] args) {
            CalculadoraMejorado suma = (a, b) -> a + b;
            int resultado = suma.operacion(5, 3);
            System.out.println("Resultado: " + resultado);
        }
    }
}
