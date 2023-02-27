package br.com.unit.aula01;
import java.util.Scanner;
public class AppFonte {

 public static void main(String[] args) {
	Scanner lerTeclado = new Scanner(System.in);
	
	Fonte fonte = new Fonte();
		
	Fonte [] vetor = new Fonte[3];
		
	for (int i = 0; i < vetor.length; i++) {
		int codigo;
		do {
			System.out.printf("digite o código do %d° produto:   ", i+1);
			codigo = lerTeclado.nextInt();
			if(codigo<=0) {
				System.out.println("número inválido! digite o código do %d° produto:   ");
				continue;
			}
		break;
		}while(true);
		
		String descricao;
		
		System.out.printf("digite a descrição do %s° produto:   ", i+1);
		descricao = lerTeclado.next();
		
		double precoCusto;
		do { 	
			System.out.printf("digite o preço de custo do %d° produto:   ", i+1);
			precoCusto = lerTeclado.nextDouble();
			if(precoCusto<=0) {
				System.out.printf("número inválido! digite o preço de custo do produto:   ");
				continue;
			}
		break;
		}while(true);
	
		vetor [i] = new Fonte(codigo, descricao, precoCusto);

	}
	
 }
}
