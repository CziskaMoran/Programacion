public class ContarPositivosNegativos {

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
				numeros[9] = 200;		
		
		System.out.println(numeros.length);
		int iguales = 0;
		int positivos = 0;		
		int negativos = 0;		
		int sumapositivos=0 , sumanegativo =0;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==0) {
				iguales++;
				System.out.println("Sus numeros son iguales"+ iguales);
				} 
			else if (numeros[i]>=0) {
				positivos++;
				sumapositivos =+ numeros[i];
				System.out.println("Sus numeros son positivos"+ positivos);
				}
			else if (numeros[i]<=0) {
				negativos++; 
				sumanegativo =+ numeros[i];
				System.out.println("Sus numeros son negativos"+ negativos);
			}
			}
		}
}
