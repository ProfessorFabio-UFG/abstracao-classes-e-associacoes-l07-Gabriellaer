public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	Cliente(String nome, String cpf, Endereco endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf + "\nEndereco: " + endereco;
	}
}
