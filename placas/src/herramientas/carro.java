package herramientas;
public class carro {
	public String numero;
	public String placa;
	public String marca;
	public int kilometraje;

	public void realizarRecorrido(int distancia) {
		kilometraje += distancia;
	}
	public carro (String placaIngresada,String marcaIngresada,String numeroIngresado) {
		numero=numeroIngresado;
		placa=placaIngresada;
		marca=marcaIngresada;
		kilometraje = 0;
	}
}
