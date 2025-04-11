public class Empresa {
	private String cnpj;
	private String razao;
	private Empregado emp;
	private Endereco end;
	
	Empresa(String cnpj, String razao, Empregado emp, Endereco end){
		this.cnpj = cnpj;
		this.razao = razao;
		this.emp = emp;
		this.end = end;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public Empregado getEmp() {
		return emp;
	}
	public void setEmp(Empregado emp) {
		this.emp = emp;
	}
	
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public String toString() {
		return "CNPJ da Empresa: " + cnpj + " Razao: " + razao + "\nEndereço da empresa: " + end + 
				"\nFuncionarios: " + emp;
	}
}
