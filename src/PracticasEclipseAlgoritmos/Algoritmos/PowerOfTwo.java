package PracticasEclipseAlgoritmos.Algoritmos;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Revisa los numeros que sean potencia de 2 devuelve true
		System.out.println(easy(10));
	}
    public static boolean easy(int number){
        if(number<=0){
            return false;
        }
        while (number%2==0){
            number=number/2;
        }
        return number==1;
    }
}
