
public class Cliente extends Persona{

	private String usuario;
	private String contrase�a;
	private Reserva ListadoReservas;
	
	public Cliente(String nombre, String apellido, String dni, Domicilio domicilio) {
		super(nombre, apellido, dni, domicilio);
		
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Reserva getListadoReservas() {
		return ListadoReservas;
	}

	public void setListadoReservas(Reserva listadoReservas) {
		ListadoReservas = listadoReservas;
	}
	

}
