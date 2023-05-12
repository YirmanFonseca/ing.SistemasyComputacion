package placas;
import herramientas.*;
import java.util.Arrays;
import java.util.Collections;
public class Principal_Placas {
	public static void main(String[] args) {
		carro llamada = new carro(crearCarro.pplaca(), crearCarro.marca(),"0");
		carro[] vector = new carro[crearCarro.cantidad()];
		Integer[] kilometros=new Integer[vector.length];
		System.out.println("la cantidad de carros creados es: "+vector.length);
		for(int i=0;i<vector.length;i++) {
			vector[i]= new carro (crearCarro.pplaca(), crearCarro.marca(),"carro "+(i+1));
			
			System.out.println( vector[i].numero);
			System.out.println(vector[i].placa);
			System.out.println(vector[i].marca);
			System.out.println(vector[i].kilometraje);
			System.out.println();
		}
		int s=crearCarro.recorrido();
		System.out.println("el numero de recorridos que realiza cada carro es: "+s);
		System.out.println(" ");
		for(int y=0;y<vector.length;y++) {	
			System.out.println("//"+(vector[y].numero)+"//" );
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
			System.out.println("///"+ (vector[a].numero)+"///");
			System.out.println(vector[a].placa);
			System.out.println(vector[a].marca);
			System.out.println(vector[a].kilometraje);
			System.out.println();
		}
		System.out.println("|||el orden de mayor a menor segun el kilometraje de los carros es: |||");
		 for(int i=0; i < vector.length-1; i++){
             for(int j=0; j < (vector.length-1-i); j++){  
                  if(vector[j].kilometraje < vector[j+1].kilometraje){  
                          int aux=vector[j].kilometraje;    
                          String auxiliar1=vector[j].numero;
                          String auxiliar2=vector[j].marca;
                          String auxiliar3=vector[j].placa;
                          vector[j].kilometraje=vector[j+1].kilometraje;     
                          vector[j].numero=vector[j+1].numero;           
                          vector[j].marca=vector[j+1].marca;           
                          vector[j].placa=vector[j+1].placa;           
                          vector[j+1].kilometraje=aux;
                          vector[j+1].numero=auxiliar1;
                          vector[j+1].marca=auxiliar2;
                          vector[j+1].placa=auxiliar3;
                   }  
                 
             }
        }
      System.out.println("\nVector ordenado: ");
      	for(int i=0;i<vector.length;i++){
      		System.out.println(vector[i].numero);
      		System.out.println(vector[i].marca);
      		System.out.println(vector[i].placa);
      		System.out.println(vector[i].kilometraje);

          }	
      	System.out.println("|||el orden de menor a mayor segun el kilometraje de los carros es: |||");
		 for(int i=0; i < vector.length-1; i++){
            for(int j=0; j < (vector.length-1-i); j++){  
                 if(vector[j].kilometraje > vector[j+1].kilometraje){  
                         int aux=vector[j].kilometraje;    
                         String auxiliar1=vector[j].numero;
                         String auxiliar2=vector[j].marca;
                         String auxiliar3=vector[j].placa;
                         vector[j].kilometraje=vector[j+1].kilometraje;     
                         vector[j].numero=vector[j+1].numero;           
                         vector[j].marca=vector[j+1].marca;           
                         vector[j].placa=vector[j+1].placa;           
                         vector[j+1].kilometraje=aux;
                         vector[j+1].numero=auxiliar1;
                         vector[j+1].marca=auxiliar2;
                         vector[j+1].placa=auxiliar3;
                  }  
                
            }
       }
     System.out.println("\nVector ordenado: ");
     	for(int i=0;i<vector.length;i++){
     		System.out.println(vector[i].numero);
     		System.out.println(vector[i].marca);
     		System.out.println(vector[i].placa);
     		System.out.println(vector[i].kilometraje);

         }	

	}	
}