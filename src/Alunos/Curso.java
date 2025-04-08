public class Curso {
    private String name;
    private String acronym;
    Aluno aluno[];

    Curso(String name, String acronym){
        this.name = name;
        this.acronym = acronym;
    }

    public String getName(){
        return this.name;
    }
    public String getAcronym() {
        return this.acronym;
    }

    public void setData(String name, String acronym){
        this.name = name;
        this.acronym = acronym;
    }
    public String toString(){
        return "Nome do Curso: " + getName() + " Sigla: " + getAcronym();
    }
}
