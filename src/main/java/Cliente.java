import java.util.ArrayList;

public class Cliente {
	
	private String cuitCuil;
	private String razonSocial;
	private String domicilio;
	private String telefono;
	private String mail;
	private ArrayList <Servicio> serviciosContratados;
	private boolean activo = true;
	
	

	
	public Cliente(String cuitCuil, String razonSocial, String domicilio, String telefono, String mail
			, boolean activo) {
	
		this.cuitCuil = cuitCuil;
		this.razonSocial = razonSocial;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
		this.activo = activo;
	}
	
	
	public void bajaCliente() {
		this.activo = false;
	}
	
	public void agregarServicio(Servicio servicio) {
		serviciosContratados.add(servicio);
	}
	
	
}
