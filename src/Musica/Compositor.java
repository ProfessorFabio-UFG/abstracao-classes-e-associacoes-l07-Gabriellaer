public class Compositor {
    private String name;
    private String nationallity;

    Compositor(String name, String nationallity){
        this.name = name;
        this.nationallity = nationallity;
    }

    public String getName(){
        return this.name;
    }
    public String getNationallity(){
        return this.nationallity;
    }
    public void setDataC(String name,String nationallity){
        this.name = name;
        this.nationallity = nationallity;
    }
    
    public String toString(){
        return "Nome compositor: " + getName() + " Nacionalidade: " + getNationallity();
    }
}
