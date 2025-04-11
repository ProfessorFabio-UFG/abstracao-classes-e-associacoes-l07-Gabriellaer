public class Empregado {
	private String nome;
	private int matri;
	private Endereco end;
	private Empresa em;
	
	Empregado(String nome, int matri, Endereco end, Empresa em){
		this.nome = nome;
		this.matri = matri;
		this.end = end;
		this.em = em;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatri() {
		return matri;
	}
	public void setMatri(int matri) {
		this.matri = matri;
	}
	
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public Empresa getEmp() {
		return em;
	}
	public void setEmp(Empresa em) {
		this.em = em;
	}
	
	public String toString() {
		return "Empregado: " + nome + " Matricula: " + matri + " End do empregado: " + end;
	}
}
