package lojadegames;

public class Jogo extends Produto{
	private String genero;
	
	public Jogo(String nome, String plataforma, double preco, int estoque, String descricao, String genero) {
		super(nome,plataforma,preco,estoque,descricao);
		this.genero = genero;
	}
    public String getGenero() {
    	return genero;
    }
    
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    public void imprimirInfo() {
    	super.imprimirInfo();
    	System.out.println("Gênero: "+genero);
    }
}
