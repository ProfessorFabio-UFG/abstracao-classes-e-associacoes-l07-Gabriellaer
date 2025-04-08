public class Curso {
    private String nome;
    private String sigla;    
    private Departamento d;
    
    Curso(String nome, String sigla, Departamento d){
        this.nome = nome;
        this.sigla = sigla;
        this.d = d;
    }
    
    public Departamento getD() {
    	return this.d;
    }
    public void setD(Departamento d) {
    	this.d = d;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public Departamento getDepartamento() {
    	return this.d;
    }
    public String toString() {
        return nome + " Sigla: " + sigla + " Departamento: " + d;
    }
}
