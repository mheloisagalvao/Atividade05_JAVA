import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, 
		vetor[] = new int[10];

		for (i = 1; i < vetor.length; i++) {
			System.out.printf("Digite o " + i + "º número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 != 0) {
				System.out.println("Nº " + vetor[i] + " é ímpar e está na " + i + "ª posição.\n");
			}

		}
		sc.close();
	}
}
