package grafos;

import java.io.Serializable;

/**
 * Representacion de las aristas de un grafo con la implementacion<br> 
 * de adyacencia.
 */
public class Arista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1060711704035887827L;

	/**Coste de la arista**/
	private int coste;
	
	/**Nodo destino de la arista**/
	private Object destino;
	
	/**Constructor**/
	public Arista (int coste, Object destino) {
		this.coste = coste;
		this.destino = destino;
	}

	/**Metodos accesores y mutadores**/
	
	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public Object getDestino() {
		return destino;
	}

	public void setDestino(Object destino) {
		this.destino = destino;
	}
	
}
