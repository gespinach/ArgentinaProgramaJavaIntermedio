import java.sql.Date;
import java.util.ArrayList;

public class Incidente {
	
	private int idIncidente;
	private Cliente cliente;
	private Servicio servicio;
	private ArrayList<TipoDeProblema> tiposDeProblemas;
	private String descripcionDeProblema;
	private Tecnico tecnicoAsignado;
	private int hsAdicionalesComplejo;
	private Date fechaEstimadaDeResolucion;
	private Date fechaIncidente;
	private Date fechaFinIncidente;
	private boolean activo=true;
	private Estado estado = Estado.INICIADO;
	public Incidente(int idIncidente, Cliente cliente, Servicio servicio, 
			String descripcionDeProblema,
			Date fechaIncidente, boolean activo,
			Estado estado) {
		
		this.idIncidente = idIncidente;
		this.cliente = cliente;
		this.servicio = servicio;
		this.descripcionDeProblema = descripcionDeProblema;
		this.fechaIncidente = fechaIncidente;
		this.activo = activo;
		this.estado = estado;
	}
	
	public void bajaIncidente() {
		this.activo = false;
	}
	
	
	
	
	
	
}