package herramientas;
public class crearCarro {
	public static int cantidad() {
		int aleatorioVector=(int)(Math.random()*12+5);
		return aleatorioVector;
		
	}
	
	public static String pplaca() {
	String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	String[] numero={"1","2","3","4","5","6","7","8","9"};
	String placa="";
	
	for (int i=0; i <3;i++) {
		int aleatorio1= (int)(Math.random()*26+1);
		placa=placa+ abc[aleatorio1];
	}
	placa=placa+"-";
	for(int j=0;j<3;j++) {
		int aleatorio2= (int)(Math.random()*8+1);
		placa=placa+ numero[aleatorio2];
	}
	
	return placa;

	}
	public static String marca() {
		String []vectorMarca= {"nissan","chevrolet","mazda"};
		int aleatorioMarca=(int)(Math.random()*3+1);
		String marcaCarro= vectorMarca [aleatorioMarca-1];
		return marcaCarro;
	}
	public static int recorrido() {
		int aleatorioRecorrido= (int)(Math.random()*15+5);
		return aleatorioRecorrido;
	}
	public static int kilometraje() {
		int aleatoriokilometros=(int)(Math.random()*99+1);
		return aleatoriokilometros;
	}
	public static void imprimir(carro[]vector) {
		for(int i=0; i< vector.length;i++) {
			System.out.println(vector[i].numero);
			System.out.println(vector[i].marca);
			System.out.println(vector[i].placa);
			System.out.println(vector[i].kilometraje);
		}
	}
	
}
