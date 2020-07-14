
public class SumaDeVectores {

	public static void main(String[] args) {
		int [] v1 = new int[5];
		v1[0] = 1;
		v1[1] = -3;		
		v1[2] = 6;
		v1[3] = 8;
		v1[4] = -9;
		
		int [] v2 = new int[5];
		v2[5] = 19;
		v2[6] = -20;		
		v2[7] = 0;
		v2[8] = 17;
		v2[9] = -10;
		int totalV1 = 0, 
				totalV2 = 0;
			
			for (int i=0;i<v1.length;i++) {
				totalV1 = totalV1 + v1[i];
				
			}
			
			for (int i=0;i<v2.length;i++) {
				totalV2 += v2[i];
			
			if(totalV1 > totalV2) {
				System.out.println("Vector 1 es mayor " + totalV1);
			} else if (totalV2 > totalV1) {
				System.out.println("Vector 2 es mayor " + totalV2);
			} else {
				System.out.println("Vector 1 y Vector 2 son iguales " + totalV1);
			}
			
		}
		}
	}

