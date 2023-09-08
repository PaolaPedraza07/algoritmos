package PracticasEclipseAlgoritmos.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncionalInterfaces {

    public static void main(String[] args) {
    //Consumer
    // Esta interfaz se utiliza para consumir (aceptar) un objeto de tipo T sin devolver ningún resultado.
        Function<Integer, Integer> duplicar = num -> num * 2;
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        /* Utilizando Consumer para imprimir los nombres*/
        Consumer<String> imprimirNombre = nombre -> System.out.println(nombre);
        nombres.forEach(imprimirNombre);

    //Predicate
    //Esta interfaz se utiliza para evaluar una condición en un objeto de tipo T y devolver un valor booleano.
        Predicate<Integer> esPar = num -> num % 2 == 0;
        System.out.println("Es 4 par? " + esPar.test(4));
        System.out.println("Es 7 par? " + esPar.test(7));

    //Supplier
    //Esta interfaz se utiliza para proporcionar un valor de tipo T sin tomar ningún argumento.
        Supplier<String> obtenerMensaje = () -> "Hola, mundo!";
        System.out.println(obtenerMensaje.get());
    }



}
