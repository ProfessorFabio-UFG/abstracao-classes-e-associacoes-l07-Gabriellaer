public class Departamento {
    private String nome;
    private String sigla;
    
    Departamento(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public String getSigla(){
        return this.sigla;
    }

    public String toString(){
        return nome + " Sigla: " + sigla;
    }
}
