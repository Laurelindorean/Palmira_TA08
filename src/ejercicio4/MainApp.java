package ejercicio4;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie serie1=new Serie();
		serie1.setCreador("David Fincher");
		serie1.setTitulo("Mindhunter");
		serie1.setGenero("Thriller");
		serie1.setNumeroTemporadas(2);
		serie1.setEntregado(true);
		System.out.println(serie1.toString());
		
		Serie serie2 = new Serie("Lost", "J.J. Abrams");
		System.out.println("El titulo de la serie es: " + serie2.getTitulo());
		System.out.println("El creador de la serie es: " + serie2.getCreador());
		
		Serie serie3 = new Serie("The Mandalorian", 3, "Ciencia-Ficción", "Jon Favreau");
		System.out.println(serie3.toString());
	}

}
