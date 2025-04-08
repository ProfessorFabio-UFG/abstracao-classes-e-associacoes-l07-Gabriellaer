public class Departamento {
    private String name;
    private String acronym;
    Curso curso;

    Departamento(String name, String acronym){
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
        return "Departamento: " + getName() + " Sigla: " + getAcronym();
    }
}
