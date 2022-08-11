package Aula2;

import java.util.Scanner;

public class Atividade5class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== TABUADA DE MULTIPLICACAO ===");
		
		int numero1;
		int numero2;
		int multiplicacao;
		
		System.out.println("Digite um numero para gerar a tabuada: ");
		numero1 = input.nextInt();
		System.out.println("Tabuada de Multiplicacao de " + numero1);
		for(numero2=0; numero2<=10; numero2++) {
			multiplicacao = numero1*numero2;
			System.out.println(numero1 + "x" + numero2 + "=" + multiplicacao);
		}
		System.out.println("FIM DO PROGRAMA TABUADA");
		
		input.close();
		
	}

}
