package ejercicio2;

import java.util.Random;

/**
 * 
 * @author Palmira
 *
 */

/*
 * 2. Haz una clase llamada Password que siga las siguientes condiciones:
 * 
 * Que tenga los atributos longitud y contraseña. Por defecto, la longitud será
 * 8. Los constructores serán los siguientes: Un constructor por defecto Un
 * constructor con la longitud que nosotros le pasemos. Genera una contraseña
 * aleatoria con esa longitud.
 */

public class Password {

	private int longitud;
	private String contrasenya;
	private static final int LONG_DEF = 8;

	public Password() {
		this(LONG_DEF, "");
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenya = generarPassword();

	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenya=" + contrasenya + "]";
	}

	public String generarPassword() {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < longitud; i++) {
			int indice = random.nextInt(letras.length());
			char randomChar = letras.charAt(indice);
			sb.append(randomChar);
		}
		String palabraRandom = sb.toString();
		return palabraRandom;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public static int getLongDef() {
		return LONG_DEF;
	}

	public Password(int longitud, String contrasenya) {
		this.longitud = longitud;
		this.contrasenya = contrasenya;
	}
}
