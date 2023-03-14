package ejercicio1;

/**
 * 
 * @author Palmira
 *
 */
/*
 * 1. Haz una clase llamada Persona que siga las siguientes condiciones:
 *  Sus atributos:nombre, edad, DNI, sexo(H hombre, M mujer), peso y altura. No
 *  queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el
 *  más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
 *  
 *  Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo(0 
 *  números, cadena vacía String, etc.) Sexo sera hombre por defecto, usa una constante 
 *  pera ello.
 *  
 *  Se implantaran varios constructores:
 *  Un constructor por defecto
 *  Un constructor con el nombre, edad y sexo, el resto por defecto.
 *  Un constructor con todos los atributos como parámetro. 
 */



public class Persona {

	private static final char SEXO_DEF = 'H';

	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	private String dni;
	
	
	//Constructor por defecto
	public Persona() {
		this("", 0, SEXO_DEF, 0, 0);
	}

	//Constructor con el nombre, edad y sexo, el resto por defecto
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = "";
		this.peso = 0.0;
		this.altura = 0.0;
	}

	//constructor con todos los atributos como parámetro.
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, char sexo, double altura, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + ", dni=" + dni + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static char getSexoDef() {
		return SEXO_DEF;
	}

}
