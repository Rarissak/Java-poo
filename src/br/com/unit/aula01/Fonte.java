package br.com.unit.aula01;

public class Fonte {
	private String descricao;
	private int codigo;
	private int estoque;
	private double precoCusto;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEstoque() {
		return estoque;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public Fonte (int codigo, String descricao, double precoCusto){
		this.descricao = descricao;
		this.codigo = codigo;
		this.precoCusto = precoCusto;
	}
	public void registrarProducao (int quantProduzida) {
		estoque += quantProduzida; 
	}
	
	public boolean registrarEscoamento(int quantEscoada) {
			if(estoque > quantEscoada) {
				estoque = estoque- quantEscoada;
				return true;
			}else {
				return false;
				
			}
	}
	public double obterValorEstoque() {
		return  estoque * precoCusto; 
	}
}

