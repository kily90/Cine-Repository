
public class Entrada {

	private float total;
	private Cliente cliente;
	public Entrada(float total, Cliente cliente) {
		super();
		this.total = total;
		this.cliente = cliente;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
