
public class MayorArreglo {

	public static void main(String[] args) {

int [] numeros = new int[10];
		numeros[0] = 1;
		numeros[1] = -3;		
		numeros[2] = 6;
		numeros[3] = 8;
		numeros[4] = -9;
		numeros[5] = 19;
		numeros[6] = -20;		
		numeros[7] = 0;
		numeros[8] = 17;
		numeros[9] = -10;
		
		System.out.println(numeros.length);
		int mayor = numeros [0]; 
		int posicion = -0;
		for(int i=0;i<numeros.length;i++) {
			if(mayor<numeros[i]) {
				mayor=numeros[i];
				posicion = 1;
				
			}
			}
		System.out.println("Su numero es mayor"+ mayor);
		System.out.println("Su numero es mayor"+ posicion);
	
	}

}
