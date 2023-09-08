package PracticasEclipseAlgoritmos.hilos;

public class EjemploHilos {
        public static void main(String[] args) {
            MiHilo hilo1 = new MiHilo(1);
            MiHilo hilo2 = new MiHilo(2);

            hilo1.start();
            hilo2.start();
        }
}
