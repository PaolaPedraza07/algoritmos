package PracticasEclipseAlgoritmos.trainning;

public class MyClass<T, V>{
	
	T ob;
	V ob1;
	
	public MyClass(T ob, V ob1) {
		this.ob= ob;
		this.ob1 = ob1;
	}
	
	void showType(){
		System.out.println(ob.getClass().getName());
		System.out.println(ob1.getClass().getName());
	}
}
