package PracticasEclipseAlgoritmos.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsGoodPractice {
    public static void main(String[] args) {

        Stream<String> streamDeStrings = Stream.of("Paola", "Yordy", "Loky", "Kaiser") //stream of
                //.filter(s -> s.contains("a")); //contiene a
                //.map(s -> s.toUpperCase()); //todos a mayus
                //.anyMatch("P")); //Cambiar Stream<String> por boolean
                .filter(s -> s.contains("a"))
                .filter(s -> s.startsWith("P"))
                ;
        List<String> lista2 = streamDeStrings.collect(Collectors.toList()); //forma de hacer lista
        System.out.println(lista2);


        List<String> lista = Arrays.asList("Paola", "Yordy", "Loky", "Kaiser");//otra forma de hacer lista
        Stream<String> streamDeLista = lista.stream(); //metodo .stream

        listaMappeo();

    }

    //Otros ejemplos
    public static void listaMappeo(){
        List<String> result = List.of("a", "aa", "b", "bb", "c")
                .stream()
                .filter(s -> s.startsWith("b"))
                .map(s -> "*" + s)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
