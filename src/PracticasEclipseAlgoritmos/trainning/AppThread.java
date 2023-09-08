package PracticasEclipseAlgoritmos.trainning;

//1 thread
class MyTask extends Thread{
	@Override
	public void run() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("Printing doc #" +doc+" printer2");
		}
	}
}

//2 thread
class MyTask2 implements Runnable{
	@Override
	public void run() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("Printing doc #" +doc+" printer3");
		}
	}
}

public class AppThread {
	public static void main(String[] args) {
		System.out.println("Started");
		
		//Run thread1
		MyTask task = new MyTask();
		task.start();
		
		//run thread 2  
		Runnable r = new MyTask2();
		Thread task2 = new Thread(r);
		task2.start();
		

		
		for(int doc=1; doc<=10; doc++) {
			System.out.println("Printing doc #" +doc);
		}
		System.out.println("Finished");
	}
}
