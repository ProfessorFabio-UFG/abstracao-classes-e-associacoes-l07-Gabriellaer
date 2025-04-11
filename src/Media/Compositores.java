public class Compositores {
	private String nome;
	private String nacionalidade;
	
	Compositores(String nome, String nacionalidade){
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacio() {
		return this.nacionalidade;
	}
	public void setNacio(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String toString() {
		return nome + " Nacionalidade: " + nacionalidade;
	}
}
