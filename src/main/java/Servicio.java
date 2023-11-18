import java.util.ArrayList;

public class Servicio {
	
	private int idServicio;
	private String servicio;
	private int tiempoDeResolucion;
	private ArrayList <TipoDeProblema> tiposDeProblemas;
	private boolean activo = true;
	
		
	public Servicio(int idServicio, String servicio, int tiempoDeResolucion, 
			boolean activo) {
		this.idServicio = idServicio;
		this.servicio = servicio;
		this.tiempoDeResolucion = tiempoDeResolucion;
		this.tiposDeProblemas = tiposDeProblemas;
		this.activo = activo;
	}
	
	public void bajaServicio () {
		this.activo = false;
	}
	
	public void agregarTipoDeProblema (TipoDeProblema tipoDeProblema) {
		tiposDeProblemas.add(tipoDeProblema);
	}
	
}
