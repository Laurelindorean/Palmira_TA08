package ejercicio1;
/**
 * 
 * @author Palmira
 *
 */

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		System.out.println(persona1.toString());
		Persona persona2 = new Persona("Palmira", 37, 'M');
		System.out.println(persona2.toString());
		Persona persona3 = new Persona("Miguel", 30, "478954877A", 'H', 80.5, 170);
		System.out.println(persona3.toString());

	}

}
