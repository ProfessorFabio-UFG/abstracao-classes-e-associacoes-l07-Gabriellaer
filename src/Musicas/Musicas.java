public class Musicas {
	private String nome;
	private int ano;
	private String tipo;
	private Compositores comp[];
	
	Musicas(String nome, int ano, String tipo, Compositores comp[]){
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.comp = comp;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Compositores[] getComp() {
		return this.comp;
	}
	public void setComp(Compositores comp[]) {
		this.comp = comp;
	}
	
	public String toString() {
		return "Nome: " + nome + " Ano: " + ano + " Tipo: " + tipo + 
				" Compositores: " + comp;
	}
}
