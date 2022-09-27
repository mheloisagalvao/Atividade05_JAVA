import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, 
		numeros[] = new int[9], 
		positivos[] = new int[9], 
		negativos[] = new int[9], 
		qntPos = 0, qntNeg = 0;

		for (i = 1; i < numeros.length; i++) {
			System.out.printf("Digite o " + i + "º número: ");
			numeros[i] = sc.nextInt();
			
			if (numeros[i] >= 0) {
				positivos[qntPos] = numeros[i];
				qntPos++;
			} else {
				negativos[qntNeg] = numeros[i];
				qntNeg++;
			}
		}

		System.out.printf("Foram encontrados " + qntPos + " números positivos\n");
		for (i = 0; i < qntPos; i++) {
			System.out.println(positivos[i]);
		}
		
		System.out.printf("Foram encontrados " + qntNeg + " números negativos\n");
		for (i = 0; i < qntNeg; i++) {
			System.out.println(negativos[i]);
		}
		
		sc.close();

	}

}
