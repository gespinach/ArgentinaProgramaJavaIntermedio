
public class TipoDeProblema {

	private String tipoDeProblema;
	private int tiempoMaxRes;
	private boolean activo=true;
	public TipoDeProblema(String tipoDeProblema, int tiempoMaxRes, boolean activo) {
		this.tipoDeProblema = tipoDeProblema;
		this.tiempoMaxRes = tiempoMaxRes;
		this.activo = activo;
	}
	
	public void bajaTipoDeProblema() {
		this.activo = false;
	}
	
	
}