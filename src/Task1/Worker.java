package Task1;

public class Worker  extends Persone implements java.io.Serializable{
    private String workPlace ;

    public Worker(String name, String workPlace) {
        super(name);
        this.workPlace = workPlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +"Name" + "=" + getName() +" "+
                "workPlace='" + workPlace + '\'' +
                '}';
    }

    @Override
    public String showData() {
        return  "Name=" + getName() + ", " + "workPlace=" + workPlace;
    }
}
