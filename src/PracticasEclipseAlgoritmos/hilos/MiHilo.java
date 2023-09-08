package PracticasEclipseAlgoritmos.hilos;

public class MiHilo extends Thread{
    private final int id;

//    Creamos la clase MiHilo que extiende la clase Thread. Sobrescribimos el método run() para definir el comportamiento del hilo.
//
//    El constructor de MiHilo acepta un número identificador para que podamos distinguir entre los hilos en la salida.
//
//    En el método run(), cada hilo imprime los números del 1 al 5 junto con su identificador y luego duerme durante 1 segundo entre cada número.
//
//    En la clase EjemploHilos, creamos dos instancias de MiHilo (hilo1 y hilo2) y las iniciamos usando el método start(). Esto inicia la ejecución de los hilos de manera concurrente.
//


    //constructor
    public MiHilo(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + id + ": Número " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
