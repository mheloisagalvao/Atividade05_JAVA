import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, 
		temp[] = new int[13], 
		maior = 0, 
		menor = 9999, 
		indMenor = 0, 
		indMaior = 0;

		for (i = 1; i < 13; i++) {
			System.out.printf("Digite a temperatura média do " + i + "º mês do ano: ");
			temp[i] = sc.nextInt();
		}

		for (i = 0; i < 12; i++) {
			if (menor > temp[i]) {
				menor = temp[i];
				indMenor = i;
			}
		}

		for (i = 0; i < 12; i++) {
			if (maior < temp[i]) {
				maior = temp[i];
				indMaior = i;
			}
		}

		System.out.printf("\nA menor temperatura foi " + menor + "ºC e ocorreu no mês de ");

		switch (indMenor) {
		case 0:
			System.out.printf("Janeiro\n");
			break;
		case 1:
			System.out.printf("Fevereiro\n");
			break;
		case 2:
			System.out.printf("Marco\n");
			break;
		case 3:
			System.out.printf("Abril\n");
			break;
		case 4:
			System.out.printf("Maio\n");
			break;
		case 5:
			System.out.printf("Junho\n");
			break;
		case 6:
			System.out.printf("Julho\n");
			break;
		case 7:
			System.out.printf("Agosto\n");
			break;
		case 8:
			System.out.printf("Setembro\n");
			break;
		case 9:
			System.out.printf("Outubro\n");
			break;
		case 10:
			System.out.printf("Novembro\n");
			break;
		case 11:
			System.out.printf("Dezembro\n");
			break;
		}

		System.out.printf("\nA maior temperatura foi " + maior + "ºC e ocorreu no mes ");

		switch (indMaior) {
		case 0:
			System.out.printf("Janeiro\n");
			break;
		case 1:
			System.out.printf("Fevereiro\n");
			break;
		case 2:
			System.out.printf("Marco\n");
			break;
		case 3:
			System.out.printf("Abril\n");
			break;
		case 4:
			System.out.printf("Maio\n");
			break;
		case 5:
			System.out.printf("Junho\n");
			break;
		case 6:
			System.out.printf("Julho\n");
			break;
		case 7:
			System.out.printf("Agosto\n");
			break;
		case 8:
			System.out.printf("Setembro\n");
			break;
		case 9:
			System.out.printf("Outubro\n");
			break;
		case 10:
			System.out.printf("Novembro\n");
			break;
		case 11:
			System.out.printf("Dezembro\n");
			break;
		}

		sc.close();
	}

}
