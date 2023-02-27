package br.com.unit.aula01;
import java.util.Scanner;
public class AppCalculadora {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner( System.in);
		
		System.out.print("1° número: ");
		int num1 = lerTeclado.nextInt();
		
		System.out.print("2° número: ");
		int num2 = lerTeclado.nextInt();
		
		Calculadora calculadora = new Calculadora();
		calculadora.operador1 = num1;
		calculadora.operador2 = num2;
		
		System.out.printf("\nAdição.... %d", calculadora.adicao());
		System.out.printf("\nSubtração.... %d", calculadora.subtracao());
		System.out.printf("\nMultiplicação.... %d", calculadora.multiplicacao());
		System.out.printf("\nDivisão.... %d", calculadora.divisao());
		
	}
	

}
