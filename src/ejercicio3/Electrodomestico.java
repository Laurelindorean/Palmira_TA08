/**
 * 
 */
package ejercicio3;

/**
 * @author Palmira
 *
 */

/*
 * 3. Crearemos una clase llamada Electrodomestico con las siguientes
 * características: Sus atributos son precio base, color, consumo
 * energético(letras entre A y F) y peso. Indica que se podrán heredar.
 * 
 * Por defecto, el color será blanco, el consumo energético sera F, el
 * precioBase es de 100€ y el peso de 5kg. Usa constantes para ello.
 * 
 * Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si
 * el nombre esta en mayúsculas o en minúsculas
 * 
 * Los constructores que se implementaran serán: Un constructor por defecto. Un
 * constructor con el precio y el peso. El resto por defecto. Un constructor con
 * todos los atributos.
 * 
 */
public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	protected static final double PRECIO_DEFECTO = 100;
	protected static final double PESO_DEFECTO = 5;
	protected static final char CONSUMO_DEFECTO = 'F';
	protected static final String COLOR_DEFECTO = "blanco";

	public Electrodomestico() {
		this(PRECIO_DEFECTO, COLOR_DEFECTO, CONSUMO_DEFECTO, PESO_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = this.COLOR_DEFECTO;
		this.consumoEnergetico = this.CONSUMO_DEFECTO;

	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
