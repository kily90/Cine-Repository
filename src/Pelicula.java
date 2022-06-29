
public class Pelicula {

	private String nombre;
	private String categoria;
	private int duracion;
	private String tipo;
	public Pelicula(String nombre, String categoria, int duracion, String tipo) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.duracion = duracion;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
