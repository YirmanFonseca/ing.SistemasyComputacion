package placas;
import herramientas.*;
public class Principal_Placas {
	public static void main(String[] args) {
		carro llamada = new carro(crearCarro.pplaca(), crearCarro.marca(), crearCarro.kilometraje());
		carro[] vector = new carro[crearCarro.cantidad()];
		System.out.println(vector.length);
		for(int i=0;i<vector.length;i++) {
			vector[i]= new carro (crearCarro.pplaca(), crearCarro.marca(),crearCarro.kilometraje());
			System.out.println("carro "+ (i+1));
			System.out.println(vector[i].placa);
			System.out.println(vector[i].marca);
			System.out.println(vector[i].kilometraje);
			System.out.println();
		}
		int s=crearCarro.recorrido();
		for(int y=0;y<vector.length;y++) {	
			System.out.println("carro "+(y+1) );
			for(int j =0;j<s;j++){
				System.out.println("reccorido"+(j+1));
				int m=crearCarro.kilometraje();
				vector[y].realizarRecorrido(m);
				System.out.println(m);
			
			}
		}
		for(int a=0;a<vector.length;a++) {
			System.out.println("carro "+ (a+1));
			System.out.println(vector[a].placa);
			System.out.println(vector[a].marca);
			System.out.println(vector[a].kilometraje);
			System.out.println();
			}
	}

	
}