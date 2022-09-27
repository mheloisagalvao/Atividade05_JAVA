import java.util.Arrays;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[11];

		for (int i = 1; i < vetor.length; i++) {
			System.out.printf("Digite o " + i + "º valor: ");
			vetor[i] = sc.nextInt();
		}

		Arrays.sort(vetor);

		System.out.print("Ordem crescente: ");
		for (int j = 1; j < vetor.length; j++) {
			System.out.print(vetor[j] + ", ");
		}

		sc.close();

	}

}
