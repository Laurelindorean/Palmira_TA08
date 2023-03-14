package ejercicio3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico elec1 = new Electrodomestico();
		System.out.println(elec1.toString());
		Electrodomestico elec2 = new Electrodomestico(250.3, 150);
		System.out.println(elec2.toString());
		Electrodomestico elec3 = new Electrodomestico(400.35, "negro", 'A', 230.45);
		System.out.println(elec3.toString());
	}

}
