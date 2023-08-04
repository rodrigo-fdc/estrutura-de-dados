package entities;

public class Celula {

	public Celula proxima;
	private Celula anterior;
	public Object elemento;
	

	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

}
