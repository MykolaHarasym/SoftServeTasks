package Task1;

public class Persone implements java.io.Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String showData(){
        return "Name" + " " + name;

    }

    public Persone(String name) {
        this.name = name;
    }
}
