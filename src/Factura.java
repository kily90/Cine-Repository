
public class Factura {

	private int numero;
	private String fecha;
	private String formaDePago;
	private Cliente cliente;
	public Factura(int numero, String fecha, String formaDePago, Cliente cliente) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
		this.cliente = cliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
