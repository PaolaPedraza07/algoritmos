package PracticasEclipseAlgoritmos.trainning;
class Printer{
	void printDoc(int numOfCopies, String docName) {
		for(int i =1; i<numOfCopies; i++) {
			System.out.println("Printing # "+ docName+ " " +i);
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	public MyThread(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDoc(10, "Paola Profile.pdf");
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	public YourThread(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDoc(10, "Yordy Profile.pdf");
	}
}

public class MultiTreads {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		Printer printer = new Printer();
		/*printer.printDoc(10, "INE.pdf");*/
			
		MyThread mRef = new MyThread(printer);
		
		YourThread xRef = new YourThread(printer);
		
		mRef.start();
		xRef.start();
		
		System.out.println("Finished");

	}

}
