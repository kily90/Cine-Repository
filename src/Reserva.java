
public class Reserva {

	private int id;
	private Cliente cliente;
	private String fecha;
	private Butaca butaca;
	private String estado;
	
	public Reserva(int id, Cliente cliente, String fecha, Butaca butaca, String estado) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.butaca = butaca;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
