package br.com.unit.aula02;
import java.util.Scanner;
public class AppMedicaoQualidadeAr {

	






	public static void main(String[] args) {

			Scanner lerTeclado = new Scanner (System.in);

			

			System.out.println("quantidade de medições:   ");

			int qtdMedicao= lerTeclado.nextInt();

			

			MedicaoQualidadeAr [] array = new MedicaoQualidadeAr [qtdMedicao];

			

			for (int i = 0; i < array.length; i++) {

				System.out.printf("\ninsira seu %d° identificador:  " , i+1);

				int idMedicao = lerTeclado.nextInt();
			}
			
			System.out.printf("\ninsira seu %d° identificador:  " , i+1);

			int idMedicao = lerTeclado.nextInt();

			

			System.out.println("insira seu indice: ");

			int indice = lerTeclado.nextInt();

			array [i] = new MedicaoQualidadeAr (idMedicao, indice);		

		}

				

		for (int i = 0; i < array.length; i++) {

			System.out.printf("\n\n  Objeto:  Identificador %d ", array[i].getIdMedicao());

			System.out.printf("\n\n  Objeto:  Índice: %d       ", array[i].getIndice());

			System.out.printf("\n\n  Objeto:  Classificação: %s", array[i].getClassificacao());

		}		

				

				

				

				

				

				

				

				

}

}
