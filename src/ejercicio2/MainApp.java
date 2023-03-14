package ejercicio2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password pass1 = new Password(6);
		System.out.println(pass1.toString());
		Password pass2 = new Password(8);
		System.out.println(pass2.toString());
		System.out.println("La contraseña es: " + pass2.getContrasenya());
		Password pass3 = new Password();	
		System.out.println(pass3.toString());
		

	}

}
