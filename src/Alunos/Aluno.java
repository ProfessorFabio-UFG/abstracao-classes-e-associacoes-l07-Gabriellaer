public class Aluno {
    private String name;
    private int year;
    private int matriculation;
    Curso curso;

    Aluno(String name, int year, int matriculation){
        this.name = name;
        this.year = year;
        this.matriculation = matriculation;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getMatriculation(){
        return this.matriculation;
    }
    public void setData(String name, int year, int matriculation){
        this.name = name;
        this.year = year;
        this.matriculation = matriculation;
    }

    public String toString(){
        return "Nome Aluno: " + getName() + " Ano: " + getYear() + " Matricula: " + getMatriculation();
    }
}
