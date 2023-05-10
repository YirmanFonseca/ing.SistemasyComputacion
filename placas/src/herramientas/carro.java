package herramientas;
public class carro {
	public int numero;
	public String placa;
	public String marca;
	public int kilometraje;

	public void realizarRecorrido(int distancia) {
		kilometraje += distancia;
	}
	public carro (String placaIngresada,String marcaIngresada,int numeroIngresado) {
		numero=numeroIngresado;
		placa=placaIngresada;
		marca=marcaIngresada;
		kilometraje = 0;
	}
}
