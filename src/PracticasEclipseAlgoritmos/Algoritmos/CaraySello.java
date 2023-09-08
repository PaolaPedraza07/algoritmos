package PracticasEclipseAlgoritmos.Algoritmos;


public class CaraySello {

	//caras y sellos
	public static void main(String[] args) {
		int[] coin = {0,0,0,1};
		CaraySello c = new CaraySello();
		System.out.println(c.solution(coin));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int heads = 0;
		int tails = 0;
		int diff = 0;

		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				heads++;
			}else {
				tails++;
			}
		}
		//int diff = Math.abs(heads-tails);
		if(heads > tails) {
			diff = heads - tails;
		}else {
			diff = tails - heads;
		}
		
        return diff/2; 
    }

}
