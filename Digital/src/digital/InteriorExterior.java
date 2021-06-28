package digital;

import java.util.Scanner;

public class InteriorExterior {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int interior = in.nextInt();
		int exterior = in.nextInt();

		float[] inter = new float[interior];
		float[] exter = new float[exterior];

		for (int i = 0; i < interior; i++) {
			inter[i] = in.nextFloat();
		}
		for (int i = 0; i < exterior; i++) {
			exter[i] = in.nextFloat();
		}
		
		float sum =0;
		for (int i = 0; i < interior; i++) {
			sum = sum + inter[i]*18;
		}
		
		for (int i = 0; i < exterior; i++) {
			sum = sum + exter[i]*12;
		}
		System.err.println("sum-->>>"+sum);
	}
}
