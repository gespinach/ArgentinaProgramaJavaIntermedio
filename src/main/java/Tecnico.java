import java.util.ArrayList;

public class Tecnico {

	
	private String nombre;
	private String apellido;
	private String telefono;
	private String mail;
	private ArrayList <Servicio> especialidades;
	private boolean activo = true;
	private ArrayList <TipoDeProblema> tiposDeProblemas;
	public Tecnico(String nombre, String apellido, String telefono, String mail,
	boolean activo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
		this.activo = activo;
	}
	
	public void bajaTecnico() {
		this.activo = false;
	}
	
	public void agregarEspecialidad(Servicio servicio) {
		especialidades.add(servicio);
	}
	
	public void agregarTipoDeProblema(TipoDeProblema tipoDeProblema) {
		tiposDeProblemas.add(tipoDeProblema);
	}
	
	
	
	
}
