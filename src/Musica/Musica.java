public class Musica{
    private String name;
    private String type;
    private int year;
    Compositor compositor;
    Musica(String name,String type,int year){
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getYear(){
        return this.year;
    }
    public void setData(String name, String type, int year){
        this.name = name;
        this.type = type;
        this.year = year;
    }
    public String toString(){
        return "Nome da Musica: " + getName() + " Tipo: " + getType() + " Ano: " + getYear();
    }
}