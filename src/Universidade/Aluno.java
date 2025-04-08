public class Aluno {
    private String nome;
    private int matri;
    private int ano;
    private Curso curso;

    Aluno(String nome, int matri, int ano, Curso curso){
        this.nome = nome;
        this.matri = matri;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatri() {
        return this.matri;
    }
    public void setMatri(int matri){
        this.matri = matri;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public Curso getCurso(){
        return this.curso;
    }
    public void setCurso(Curso curso) {
    	this.curso = curso;
    }
    public String toString(){
        return "Aluno: " + nome + " Ano: " + ano + " Matricula: " + matri + " Curso: " + curso;
    }
}
