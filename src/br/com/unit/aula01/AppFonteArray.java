package br.com.unit.aula01;
import java.util.Scanner;
import br.com.unit.aula01.*;
public class AppFonteArray {
	static Fonte[] vetorFontes = new Fonte[3];
	static int contFontes = 0;
	static Scanner lerTeclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Fonte");
			System.out.println("2 - Consultar Fonte");
			System.out.println("3 - Registrar Produção");
			System.out.println("4 - Registrar Escoamento");
			System.out.println("5 - Listar Fontes");
			System.out.println("6-  Alterar Fonte");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = lerTeclado.nextInt();
			
			switch (opcao) {
			case 1:
				cadastrarFonte();
				break;
			case 2:
				consultarFonte();
				break;
			case 3:
				registrarProducao();
				break;
			case 4:
				registrarEscoamento();
				break;
			case 5:
				listarFontes();
				break;
			case 6:
				alterarFonte();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");
				
			}
			
		} while (opcao !=0);
	
	}
	public static Fonte pesquisarFontePorCodigo(int codigo) {
		for ( Fonte fonte : vetorFontes ) {
			if (fonte != null && fonte.getCodigo() == codigo) {
				return fonte;
			}
		}
		return null;
	}
	
	public static void cadastrarFonte() {
		System.out.println("\n--- Cadastro de Fonte ---");
		
		if (contFontes==vetorFontes.length) {
			System.out.println("\nLimite de fontes atingido!!!");
			return;
		}
		
		int codigo;
		do {
				System.out.printf("\nCódigo da fonte para cadastrar: ");
				codigo = lerTeclado.nextInt();
				
				Fonte fonteEncontrada = pesquisarFontePorCodigo(codigo);
				if(fonteEncontrada != null ) {
				System.out.println("Código não pode ser duplicado!");
				return;
			}
			if (codigo <= 0) {
				System.out.println("O código da fonte deve ser um número positivo");
				continue;
			}
			break;
		} while (true);
		
		
	
		System.out.println("Descrição: ");
		lerTeclado.nextLine();
		String descricao = lerTeclado.nextLine();
		
		double precoCusto;
		do {
			System.out.printf("Preço de Custo: ");
			precoCusto = lerTeclado.nextDouble();
			if (precoCusto<=0) {
				System.out.println("O preço de custo deve ser um valor positivo");
				continue;
			}
			break;
		} while (true);
		
		vetorFontes[contFontes] = new Fonte(codigo, descricao, precoCusto);

		System.out.printf("\nCadastro efetuado\n");
		contFontes++;
	}
	
	public static void consultarFonte() {
		System.out.println("\n--- Consulta de Fonte ---");
		if (contFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}	
		
		System.out.printf("\nCódigo da fonte para consultar: ");
		int codigo = lerTeclado.nextInt();
		
		Fonte fonteEncontrada = pesquisarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		System.out.printf("\nCódigo...........: %d", fonteEncontrada.getCodigo());
		System.out.printf("\nDescrição........: %s", fonteEncontrada.getDescricao());
		System.out.printf("\nEstoque..........: %d", fonteEncontrada.getEstoque());
		System.out.printf("\nPreço de Custo...: R$ %.2f", fonteEncontrada.getPrecoCusto());
		System.out.printf("\nValor do Estoque.: R$ %.2f\n", fonteEncontrada.obterValorEstoque());
		
	}
	
	public static void alterarFonte() {
		int codigo  ;
		System.out.printf("\n--- Alterar fonte ----");
		System.out.println();
		System.out.println("digite o codigo da fonte:         ");
		codigo = lerTeclado.nextInt();
		
		Fonte fonteEncontrada = pesquisarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		
	String descricao;
	
	System.out.printf("\ndigite a nova descrição:     ");
	descricao = lerTeclado.next();
	fonteEncontrada.setDescricao(descricao);
	
	double precoCusto;
	do {
	System.out.printf("\ndigite o novo preço de custo: R$ ");
	precoCusto = lerTeclado.nextDouble();
	if(precoCusto <=0) {
		System.out.println("preço de custo inválido! precisa ser positivo!");
		continue;
	}
	
	fonteEncontrada.setPrecoCusto(precoCusto);
	
	break;
	}while(true);
	
	System.out.printf("\nFonte alterada com sucesso!");
	
	
	}
	
	public static void registrarProducao() {
		System.out.println("\n--- Registrar Produção ---");
		if (contFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}	
		
		System.out.printf("\nCódigo da fonte: ");
		int codigo = lerTeclado.nextInt();

		Fonte fonteEncontrada = pesquisarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		System.out.println("Quantidade Produzida:");
		int qtdeProduzida = lerTeclado.nextInt();
		
		fonteEncontrada.registrarProducao(qtdeProduzida);
		System.out.println("\nProdução registrada!!!");
		
	}
	
	
	public static void registrarEscoamento() {
		System.out.println("\n--- Registrar Escoamento ---");
		if (contFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}	
		
		System.out.printf("\nCódigo da fonte: ");
		int codigo = lerTeclado.nextInt();

		Fonte fonteEncontrada = pesquisarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		System.out.println("Quantidade Escoada:");
		int qtdeEscoada = lerTeclado.nextInt();
		
		if (fonteEncontrada.registrarEscoamento(qtdeEscoada) == true) {
			System.out.println("\nEscoamento registrado!!!");						
		}
		else {
			System.out.println("\nEstoque não disponível!!!");
		}
			
	}
	
	public static void listarFontes() {
		if (contFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}
		System.out.println("      Listagem de Fonte");
		System.out.println("________________________________________________________\n");
		System.out.println("Código Descrição       Estoque  Preço Custo  Vl. Estoque");
		System.out.println("________________________________________________________");
		
		for (int i = 0; i < vetorFontes.length; i++) {
			if (vetorFontes[i] != null) {
				System.out.printf("\n%-4d   %-15s %7d  %11.2f  %11.2f",
						vetorFontes[i].getCodigo(),
						vetorFontes[i].getDescricao(),
						vetorFontes[i].getEstoque(),
						vetorFontes[i].getPrecoCusto(),
						vetorFontes[i].obterValorEstoque());
			}
		}
		System.out.println("\n________________________________________________________\n");
		
	}	
	
	}






