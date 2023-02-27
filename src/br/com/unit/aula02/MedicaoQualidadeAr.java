package br.com.unit.aula02;

public class MedicaoQualidadeAr {
	private int idMedicao;
	private int indice;
	private String classificacao;
	
	public MedicaoQualidadeAr (int idMedicao, int indice) {
		this.idMedicao = idMedicao;
		this.indice = indice;
		this.definirClassificacao();
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}


	public int getIdMedicao() {
		return idMedicao;
	}
	public void setIdMedicao( int idMedicao) {
		this.idMedicao = idMedicao;
	}


	public String getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String definirClassificacao (){
		
	if (indice >= 0 && indice <= 50) {
		classificacao = "Boa!";
	}
	else if ( indice >= 51 && indice <= 100){
		classificacao = "Regular!";
	}
	else if (indice >= 101 && indice <=199) {
		classificacao = "Inadequada!";
	}
	else if (indice >= 200 && indice <=299) {
		classificacao = "Má!";
	}
	else if (indice >=300 && indice <=399) {
		classificacao = "Péssima!";
	}
	else {
		classificacao = "Crítica!";
	}
	return classificacao;

}
}
