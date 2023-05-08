package herramientas;

public class carro {
	
	String placa;
	String marca;
	int kilometraje;

	public void realizarRecorrido(int distancia) {
		kilometraje +=distancia;
	}
	public carro (String placaIngresada,String marcaIngresada) {
		placa=placaIngresada;
		marca=marcaIngresada;
		kilometraje=0;
	}
}
