/**
 * 
 */
package ejercicio4;

/**
 * @author Palmira
 *
 */
public class Serie {

	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	private static final int TEMPORADAS_DEF = 3;
	private static final boolean ENTREGADO_DEF = false;

	public Serie() {

	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO_DEF;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
