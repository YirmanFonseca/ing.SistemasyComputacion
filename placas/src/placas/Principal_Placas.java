package placas;
import herramientas.*;
import java.util.Arrays;
import java.util.Collections;
public class Principal_Placas {
	public static void main(String[] args) {
		carro llamada = new carro(crearCarro.pplaca(), crearCarro.marca());
		carro[] vector = new carro[crearCarro.cantidad()];
		Integer[] kilometros=new Integer[vector.length];
		System.out.println("la cantidad de carros creados es: "+vector.length);
		for(int i=0;i<vector.length;i++) {
			vector[i]= new carro (crearCarro.pplaca(), crearCarro.marca());
			System.out.println("carro "+ (i+1));
			System.out.println(vector[i].placa);
			System.out.println(vector[i].marca);
			System.out.println(vector[i].kilometraje);
			System.out.println();
		}
		int s=crearCarro.recorrido();
		System.out.println("el numero de recorridos que realiza cada carro es: "+s);
		System.out.println(" ");
		for(int y=0;y<vector.length;y++) {	
			System.out.println("//carro "+(y+1)+"//" );
			for(int j =0;j<s;j++){
				System.out.println("reccorido"+(j+1));
				int m=crearCarro.kilometraje();
				vector[y].realizarRecorrido(m);
				kilometros [y]=vector[y].kilometraje;
				System.out.println(m);
			}
		}
		Arrays.sort(kilometros, Collections.reverseOrder());
		System.out.println("el total del kilometraje de cada carro despues de realizar los recorridoes es: ");
		for(int a=0;a<vector.length;a++) {
			System.out.println("///carro "+ (a+1)+"///");
			System.out.println(vector[a].placa);
			System.out.println(vector[a].marca);
			System.out.println(vector[a].kilometraje);
			System.out.println();
		}
		System.out.println("|||el orden de mayor a menor segun el kilometraje de los carros es: |||");
		for(int q:kilometros) {
			for(int h=0;h<vector.length;h++) {
			if(q==vector[h].kilometraje) {
				System.out.println("///carro "+ (h+1)+"///");
				System.out.println(vector[h].placa);
				System.out.println(vector[h].marca);
				System.out.println(vector[h].kilometraje);
				System.out.println();
			}
				}
		}
		
	}
	
}