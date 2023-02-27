package br.com.unit.aula03;
import java.util.Scanner;
public class Araay {

	
	static int[] dias = new int[5];
	
					
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
						
		for (int i = 0; i < dias.length; i++) {
			System.out.printf("Frequência do %dº dia: ", i+1);
			dias[i]=lerTeclado.nextInt();
		}
						
		System.out.printf("\nFrequência total: %d", acharTotalFrequencia());
		System.out.printf("\nFrequência média: %.1f", acharFrequenciaMedia() );
		int maiorIndice = acharIndiceMaiorFrequencia();
		int menorIndice = acharIndiceMenorFrequencia();
		System.out.printf("\nMaior frequência: %d", dias[maiorIndice]);	
		System.out.printf("\nMenor frequência: %d", dias[menorIndice]);
		System.out.printf("\nDia com maior frequência: %d", maiorIndice +1);
		System.out.printf("\nDia com menor frequência: %d", menorIndice +1);
		System.out.printf("\nQuantidade de dias com maior frequência: %d", acharFrequenciaAcimaMedia());
		System.out.printf("\nPercentual da diferença entre o maior e o menor índice: %2f", acharDiferencaMaiorMenorFrequencia());
		System.out.printf("\nQuantidade de frequência pares: %d", acharFrequenciasPares());

						
		}
					
	public static int acharTotalFrequencia() {
		int total = 0;
		for (int i = 0; i < dias.length; i++) {
			total += dias[i];
		}
		return total;
	}
					
	public static double acharFrequenciaMedia() {
		return (double) acharTotalFrequencia() / dias.length;
	}
					
	public static int acharIndiceMaiorFrequencia() {
		int maiorFrequencia = Integer.MIN_VALUE;
		int indice = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > maiorFrequencia) {
				maiorFrequencia = dias[i];
				indice = i;
			}
		}
		return indice;		
	}
					
	public static int acharIndiceMenorFrequencia() {
		int menorFrequencia = Integer.MAX_VALUE;
		int indice = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] < menorFrequencia) {
				menorFrequencia = dias[i];
				indice = i;
			}
		}
		return indice;		
	}
					
	public static int acharFrequenciaAcimaMedia() {
		int acimaMedia = 0;
		for(int i = 0; i < dias.length; i++) {
			if (acharFrequenciaMedia() < dias[i]) {
				acimaMedia += 1;
			}
		} 
		return acimaMedia;		 
	}
					
	public static double acharDiferencaMaiorMenorFrequencia() {
		return (double)(dias[acharIndiceMaiorFrequencia()] - dias[acharIndiceMenorFrequencia()]) / (dias[acharIndiceMaiorFrequencia()]) * 100;
	}

	public static int acharFrequenciasPares(){
		int frequenciaPar = 0;
		for (int i = 0; i < dias.length; i++)
			if (dias[i] % 2 == 0) {
				frequenciaPar++;
			}

		return frequenciaPar;
	}
			

	}


