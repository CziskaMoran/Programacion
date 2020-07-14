
public class Vectores {

	public static void main(String[] args) {
		int [] numero = new int[5];
		
		numero[0] = 1;
		numero[1] = 10;		
		numero[2] = 100;
		numero[3] = 1000;
		numero[4] = 10000;
		
		System.out.println("Tamano:" + numero.length);
		for (int i = 0; i<numero.length;i++) {
			System.out.println("[" + i + "]:" + numero[i] );
		}
		System.out.println("Posición 4: "+ numero[4]);

}
}