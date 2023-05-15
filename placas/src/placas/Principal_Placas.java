package placas;
import herramientas.*;
public class Principal_Placas {
	public static void main(String[] args) {
		carro[] vector = new carro[crearCarro.cantidad()];
		System.out.println("la cantidad de carros creados es: "+vector.length);
		for(int i=0;i<vector.length;i++) {
			vector[i]= new carro (crearCarro.pplaca(), crearCarro.marca(),"carro "+(i+1));
			System.out.println( vector[i].numero);
			System.out.println(vector[i].placa);
			System.out.println(vector[i].marca);
			System.out.println(vector[i].kilometraje);
			System.out.println();
		}
		int r=crearCarro.recorrido();
		System.out.println("el numero de recorridos que realiza cada carro es: "+r);
		System.out.println(" ");
		for(int y=0;y<vector.length;y++) {	
			System.out.println("//"+(vector[y].numero)+"//" );
			for(int j =0;j<r;j++){
				System.out.println("reccorido"+(j+1));
				int d=crearCarro.kilometraje();
				vector[y].realizarRecorrido(d);
				System.out.println(d);
			}
		}
		System.out.println("el total del kilometraje de cada carro despues de realizar los recorridoes es: ");
		crearCarro.imprimir(vector);
		
		System.out.println("|||el orden de mayor a menor segun el kilometraje de los carros es: |||");
		 for(int i=0; i < vector.length-1; i++){
             for(int j=0; j < (vector.length-1-i); j++){  
                  if(vector[j].kilometraje < vector[j+1].kilometraje){  
                          carro aux=vector[j];  
                          /*
                          String auxiliar1=vector[j].numero;
                          String auxiliar2=vector[j].marca;
                          String auxiliar3=vector[j].placa;*/
                          vector[j]=vector[j+1];     
                          /*
                          vector[j].numero=vector[j+1].numero;           
                          vector[j].marca=vector[j+1].marca;           
                          vector[j].placa=vector[j+1].placa; 
                          */          
                          vector[j+1]=aux;
                          /*
                          vector[j+1].numero=auxiliar1;
                          vector[j+1].marca=auxiliar2;
                          vector[j+1].placa=auxiliar3;*/
                   }               
             }
        }
		crearCarro.imprimir(vector);
      
		System.out.println("|||el orden de menor a mayor segun el kilometraje de los carros es: |||");
		for(int i=0; i < vector.length-1; i++){
            for(int j=0; j < (vector.length-1-i); j++){  
                 if(vector[j].kilometraje > vector[j+1].kilometraje){  
                	 	carro aux=vector[j];
                        vector[j]=vector[j+1];    
                        vector[j+1]=aux;
                        
                  }  
            }
       }
		 crearCarro.imprimir(vector);
    
	}	
}