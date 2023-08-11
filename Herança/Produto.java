package lojadegames;

public class Produto {
	private String nome;
	private String plataforma;
	private double preco;
	private int estoque;
	private String descricao;
	
	public Produto(String nome, String plataforma, double preco, int estoque, String descricao) {
		this.nome = nome;
		this.plataforma = plataforma;
		this.preco = preco;
		this.estoque = estoque;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("Descrição: " + descricao);
	}

}
