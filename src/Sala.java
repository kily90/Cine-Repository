
public class Sala {

	private int numero;
	private int capacidad;
	private Butaca butaca;
	private Pelicula pelicula;
	public Sala(int numero, int capacidad, Butaca butaca, Pelicula pelicula) {
		super();
		this.numero = numero;
		this.capacidad = capacidad;
		this.butaca = butaca;
		this.pelicula = pelicula;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Butaca getButaca() {
		return butaca;
	}
	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
}
