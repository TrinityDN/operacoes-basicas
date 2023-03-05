package Continue;

import java.util.Scanner;

public class Teste {
	
	public static void main(String []args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num1 = in.nextInt();
		
		System.out.println("Digite uma operação");
		char operacao = in.next().charAt(0);
		
		System.out.println("Digite outro número");
		int num2 = in.nextInt();
		
		if(operacao == '+') {
			System.out.println("Resultado da operação:");
			System.out.println(num1 + num2);
		}
		
		if(operacao == '-') {
			System.out.println("Resultado da operação:");
			System.out.println(num1 - num2);
		}
		
		if(operacao == '/') {
			System.out.println("Resultado da operação:");
			System.out.println(num1 / num2);
		}
		
		if(operacao == '*') {
			System.out.println("Resultado da operação:");
			System.out.println(num1 * num2);
		}
		
		
		
	}

}
