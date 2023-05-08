package placas;
import herramientas.*;
public class Principal_Placas {
	public static void main(String[] args) {
		
		carro[] vector = new carro[crearCarro.cantidad()];
		System.out.println(vector.length);
		for(int i=0;i<vector.length;i++) {
			vector[i]= new carro (crearCarro.pplaca(), crearCarro.marca());
			System.out.println(vector[i]);
		}
		
	}
}