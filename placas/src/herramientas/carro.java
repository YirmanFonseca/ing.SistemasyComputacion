package herramientas;
public class carro {
	public String placa;
	public String marca;
	public int kilometraje;

	public void realizarRecorrido(int distancia) {
		kilometraje += distancia;
	}
	public carro (String placaIngresada,String marcaIngresada,int realizarRecorrido) {
		placa=placaIngresada;
		marca=marcaIngresada;
		kilometraje = 0;
	}
}
